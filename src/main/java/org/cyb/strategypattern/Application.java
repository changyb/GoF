package org.cyb.strategypattern;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Application {
    public static void main(String[] args) throws IOException {
//        Strategy strategy = StrategyFactory.getStrategy("A");
        Properties props = new Properties();
        props.load(new FileInputStream("./config.properties"));
        String type = props.getProperty("type");
        Strategy strategy = StrategyFactory.getStrategy(type);
    }
}
