package org.cyb.factorypattern.common;

import org.cyb.factorypattern.IRuleConfigParser;
import org.cyb.factorypattern.RuleConfig;

/**
 * <p>工厂方法模式</p>
 * 简单工厂模式：每个对象的创建逻辑比较简单的时候
 * 工厂模式：每个对象的创建逻辑比较复杂的时候，为了避免设计一个过于庞大的简单工厂类
 */
public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);

        IRuleConfigParserFactory parseFactory = RuleConfigParserFactoryMap.getParseFactory(ruleConfigFileExtension);
        IRuleConfigParser parser = parseFactory.createParser();

        String configText = "";
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        return "json";
    }
}
