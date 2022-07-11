package org.cyb.factorypattern.common;

import org.cyb.factorypattern.IRuleConfigParser;

public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
