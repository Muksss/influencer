package com.influencer.parser;

import com.influencer.constant.CategoryEnum;
import com.influencer.constant.Keyword;
import com.influencer.model.CategoryScore;

public class TextParser {
    public static final String DELIMETER = " |,|@|!|#";

    public static CategoryScore parseText(String text, CategoryScore categoryScore) {
        String[] words = text.split(" ");

        for (String word:words) {
            CategoryEnum categoryEnum = Keyword.getCatagory(word);
            if(categoryEnum != null) {
                categoryScore.add(categoryEnum);
            }
        }

        return categoryScore;
    }
}
