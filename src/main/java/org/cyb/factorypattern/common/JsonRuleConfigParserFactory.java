package org.cyb.factorypattern.common;

import org.cyb.factorypattern.IRuleConfigParser;
import org.cyb.factorypattern.JsonRuleConfigParser;

public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory{
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
