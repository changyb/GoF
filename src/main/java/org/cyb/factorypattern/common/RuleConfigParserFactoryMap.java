package org.cyb.factorypattern.common;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class RuleConfigParserFactoryMap {
    private static final Map<String, IRuleConfigParserFactory> cachedFactories =
            new HashMap<>();

    static {
        cachedFactories.put("json", new JsonRuleConfigParserFactory());
        cachedFactories.put("xml", new XmlRuleConfigParserFactory());
        cachedFactories.put("properties", new PropertiesRuleConfigParserFactory());
    }

    public static IRuleConfigParserFactory getParseFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }

        IRuleConfigParserFactory parserFactory = cachedFactories.get(type.toLowerCase(Locale.ROOT));
        return parserFactory;
    }
}
