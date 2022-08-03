package org.cyb.bridgepattern;

/**
 * 桥接模式
 * 将抽象和实现解耦，让它们可以独立变化
 * 一个类存在两个（或多个）独立变化的维度，我们通过组合方式，
 * 让这两个（或多个）维度可以独立扩展
 */
public abstract class Notification {
    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}
