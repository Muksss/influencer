package com.influencer.constant;

import java.util.HashMap;
import java.util.Map;

public class Keyword {
    private static Map<String, CategoryEnum> dataHolder = new HashMap<>();

    static {
        //Politics
        add("indiafirst", CategoryEnum.POLITICS);

        //Travel
        add("lifestyle", CategoryEnum.FASHION);
        add("fashion", CategoryEnum.FASHION);
    }

    private static void add(String keyword, CategoryEnum category) {
        dataHolder.put(keyword, category);
    }

    public static CategoryEnum getCatagory(String keyword) {
        return dataHolder.get(keyword.toLowerCase());
    }
}
