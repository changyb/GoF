package org.cyb.factorypattern.common;

import org.cyb.factorypattern.IRuleConfigParser;
import org.cyb.factorypattern.XmlRuleConfigParser;

public class XmlRuleConfigParserFactory implements IRuleConfigParserFactory{
    @Override
    public IRuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}
