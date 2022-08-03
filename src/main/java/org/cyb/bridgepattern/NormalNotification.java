package org.cyb.bridgepattern;

public class NormalNotification extends Notification{
    public NormalNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {

    }
}
