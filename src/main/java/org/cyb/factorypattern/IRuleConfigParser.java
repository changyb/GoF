package org.cyb.factorypattern;

import org.cyb.factorypattern.simple.RuleConfig;

public interface IRuleConfigParser {
    RuleConfig parse(String text);
}
