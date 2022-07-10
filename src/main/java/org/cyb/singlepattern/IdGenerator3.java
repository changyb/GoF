package org.cyb.singlepattern;

import java.util.concurrent.atomic.AtomicLong;

/**
 * <p>双重检测</p>
 * 高版本的jdk，instance可以不加volatile
 */
public class IdGenerator3 {
    private AtomicLong id = new AtomicLong(0);

    private static IdGenerator3 instance;

    private IdGenerator3() {}

    public static IdGenerator3 getInstance() {
        if( instance == null) {
            synchronized (IdGenerator3.class) {
                if (instance == null) {
                    instance = new IdGenerator3();
                }
            }
        }

        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
