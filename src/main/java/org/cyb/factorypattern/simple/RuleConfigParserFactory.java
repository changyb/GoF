package org.cyb.factorypattern.simple;

import org.cyb.factorypattern.IRuleConfigParser;
import org.cyb.factorypattern.JsonRuleConfigParser;
import org.cyb.factorypattern.PropertiesConfigParser;
import org.cyb.factorypattern.XmlRuleConfigParser;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class RuleConfigParserFactory {
    private static final Map<String, IRuleConfigParser> cachedParsers =
            new HashMap<>();

    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
        cachedParsers.put("properties", new PropertiesConfigParser());
    }

    public static IRuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            return null;
        }

        IRuleConfigParser parser = cachedParsers.get(configFormat.toLowerCase(Locale.ROOT));
        return parser;
    }


}
