package org.cyb.bridgepattern;

public class SevereNotification extends Notification{

    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {

    }
}
