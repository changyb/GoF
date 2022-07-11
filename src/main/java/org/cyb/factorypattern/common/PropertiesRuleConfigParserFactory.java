package org.cyb.factorypattern.common;

import org.cyb.factorypattern.IRuleConfigParser;
import org.cyb.factorypattern.PropertiesConfigParser;

public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory{
    @Override
    public IRuleConfigParser createParser() {
        return new PropertiesConfigParser();
    }
}
