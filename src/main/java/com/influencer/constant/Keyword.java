package com.influencer.constant;

import java.util.HashMap;
import java.util.Map;

public class Keyword {
    private static Map<String, CategoryEnum> dataHolder = new HashMap<>();

    static {
        //Politics
        add("Indiafirst", CategoryEnum.POLITICS);

        //Travel
        add("Indiafirst", CategoryEnum.POLITICS);
    }

    private static void add(String keyword, CategoryEnum category) {
        dataHolder.put(keyword, category);
    }

    public static CategoryEnum getCatagory(String keyword) {
        return dataHolder.get(keyword);
    }
}
