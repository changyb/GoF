package org.cyb.responsibilitypattern.list;

import org.cyb.responsibilitypattern.HandlerA;
import org.cyb.responsibilitypattern.HandlerB;
import org.cyb.responsibilitypattern.HandlerChain;

public class Application {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
