package org.cyb.singlepattern;

import java.util.concurrent.atomic.AtomicLong;

/**
 * <p>静态内部类</p>
 */
public class IdGenerator4 {
    private AtomicLong id = new AtomicLong(0);

    private IdGenerator4() {}

    public static class IdeGenerator4Holder {
        private static final IdGenerator4 instance = new IdGenerator4();
    }

    public static IdGenerator4 getInstance() {
        return IdeGenerator4Holder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
