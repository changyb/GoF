package org.cyb.singlepattern;

import java.util.concurrent.atomic.AtomicLong;

/**
 * <p>饿汉式单例模式</p>
 * 1. 如果初始化耗时长，我们最好不要等到真正用到它的时候初始化，这会影响到系统性能
 * 2. 如果实例占用资源多，按照fail-fast的设计原则，那么也希望在程序启动时就将这个实例初始化好
 */
public class IdGenerator1 {
    private AtomicLong id = new AtomicLong(0);

    private static final IdGenerator1 instance = new IdGenerator1();

    private IdGenerator1() {}

    public static IdGenerator1 getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
