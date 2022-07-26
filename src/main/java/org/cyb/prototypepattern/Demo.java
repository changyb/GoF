package org.cyb.prototypepattern;

import java.util.HashMap;
import java.util.List;

/**
 * <p>原型模式</p>
 * 如果对象的创建成本比较大，而同一个类的不同对象之间差别不大（大部分字段都相同）
 * 在这种情况下，我们可以利用对已有对象（原型）进行复制（或者叫拷贝）的方式，来创建
 * 新对象，以达到节省创建时间的目的。
 **/
public class Demo {

    private HashMap<String, SearchWord> currentKeyWords = new HashMap<>();

    private long lastUpdateTime = -1;

    // 浅拷贝旧的数据，然后把新的数据更新入浅拷贝的数据里
    public void refresh() {
        HashMap<String, SearchWord> newKeywords = (HashMap<String, SearchWord>) currentKeyWords.clone();

        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        long maxNewUpdatedTime = lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }

            if (newKeywords.containsKey(searchWord.getKeyword())) {
                newKeywords.remove(searchWord.getKeyword(), searchWord);
            }

            newKeywords.put(searchWord.getKeyword(), searchWord);
        }

        lastUpdateTime = maxNewUpdatedTime;
        currentKeyWords = newKeywords;
    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        //TODO 从数据库中取出更新时间>lastUpdateTime的数据
        return null;
    }
}
