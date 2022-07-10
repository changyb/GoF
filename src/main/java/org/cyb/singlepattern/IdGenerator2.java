package org.cyb.singlepattern;

import java.util.concurrent.atomic.AtomicLong;

/**
 * <p>懒汉式单例模式</p>
 * 1. 这个方法加了一把大锁，导致这个函数的并发度很低
 * 2. 这个单例类偶尔会被用到，那么这种实现方式还可以接受，反之不可。
 */
public class IdGenerator2 {
    private AtomicLong id = new AtomicLong(0);

    private static IdGenerator2 instance;

    private IdGenerator2() {}

    public static synchronized IdGenerator2 getInstance() {
        if (instance == null) {
            instance = new IdGenerator2();
        }

        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
