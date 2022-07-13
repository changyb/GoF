package org.cyb.builderpattern;

import org.apache.commons.lang3.StringUtils;

/**
 * <p>建造者模式</p>
 * 必填的属性有很多，把这些属性放到构造函数中设置，那构造函数参数列表就很长
 * 如果类属性之间有一定的依赖关系或者约束条件，只使用构造函数配合set方法，就无法安放依赖关系和约束条件的校验逻辑
 * 如果我们希望创建不可变对象，不能暴露set方法
 *
 * F.X.
 * --*成员变量*--  ---*解释*---  -*是否必填*-  -*默认值*-
 *    name        资源名称         是          没有
 *    maxTotal   最大总资源数量     否          8
 *    maxIdle    最大空闲资源数量    否         8
 *    minIdle    最小空闲资源数量    否         0
 */
public class ResourcePoolConfig {
    private String name;
    private int maxTotal;
    private int maxIdle;
    private int minIdle;

    private ResourcePoolConfig(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

    public static class Builder {
        private static final int DEFAULT_MAX_TOTAL = 8;
        private static final int DEFAULT_MAX_IDLE = 8;
        private static final int DEFAULT_MIN_IDLE = 0;

        private String name;
        private int maxTotal = DEFAULT_MAX_TOTAL;
        private int maxIdle = DEFAULT_MAX_IDLE;
        private int minIdle = DEFAULT_MIN_IDLE;

        public ResourcePoolConfig build() {
            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("...");
            }

            if (maxIdle > maxTotal) {
                throw new IllegalArgumentException("...");
            }

            if (minIdle > maxTotal || minIdle > maxIdle) {
                throw new IllegalArgumentException("...");
            }

            return new ResourcePoolConfig(this);
        }

        public Builder setName(String name) {
            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("...");
            }
            this.name = name;
            return this;
        }

        public Builder setMaxTotal(int maxTotal) {
            if (maxTotal < 0) {
                throw new IllegalArgumentException("...");
            }
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) {
            if (maxIdle < 0) {
                throw new IllegalArgumentException("...");
            }

            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(int minIdle) {
            if (minIdle < 0) {
                throw new IllegalArgumentException("...");
            }
            this.minIdle = minIdle;
            return this;
        }
    }
}
