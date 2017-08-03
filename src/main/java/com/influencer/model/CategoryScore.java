package com.influencer.model;

import com.influencer.constant.CategoryEnum;

import java.util.HashMap;
import java.util.Map;

public class CategoryScore {
    private Map<CategoryEnum, Integer> scoreMap = new HashMap<>();

    public Map<CategoryEnum, Integer> getScoreMap() {
        return scoreMap;
    }

    public void add(CategoryEnum categoryEnum) {
        add(categoryEnum, 1);
    }

    public void add(CategoryEnum categoryEnum, Integer count) {
        Integer updatedCount = count;
        if(scoreMap.containsKey(categoryEnum)) {
            updatedCount = scoreMap.get(categoryEnum) + count;
        }
        scoreMap.put(categoryEnum, updatedCount);
    }

    public void merge(CategoryScore other) {
        for(Map.Entry<CategoryEnum, Integer> entry : other.getScoreMap().entrySet()) {
            this.add(entry.getKey(), entry.getValue());
        }
    }
}
