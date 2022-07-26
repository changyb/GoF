package org.cyb.factorypattern.simple;

import org.cyb.factorypattern.IRuleConfigParser;
import org.cyb.factorypattern.RuleConfig;

public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) {
        String fileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = RuleConfigParserFactory.createParser(fileExtension);

        String configText = "";
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String ruleConfigFilePath) {
        return "json";
    }
}
