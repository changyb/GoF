package org.cyb.strategypattern;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
    private static final Map<String, Strategy> stragegies = new HashMap<>();

    static {
        stragegies.put("A", new ConcreteStrategyA());
        stragegies.put("B", new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty");
        }
        return stragegies.get(type);
    }
}
