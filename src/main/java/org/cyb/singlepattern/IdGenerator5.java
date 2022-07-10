package org.cyb.singlepattern;

import java.util.concurrent.atomic.AtomicLong;

public enum IdGenerator5 {
    INSTANCE;

    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        IdGenerator5.INSTANCE.getId();
    }
}
