package com.influencer.service.twitter;

import com.influencer.constant.CategoryEnum;
import com.influencer.model.CategoryScore;
import com.influencer.service.excel.ExcelManager;
import twitter4j.TwitterException;
import twitter4j.api.TrendsResources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    private static TwitterManager twitterManager = new TwitterManager();

    public static void main(String[] args) throws TwitterException {
        writeHashTagsToExcel();
    }

    public static void writeHashTagsToExcel() throws TwitterException {
        List<String> screenNames = new ArrayList<>();
        screenNames.add("MissMalini");
        screenNames.add("MissMalini");

        List<String> hashTags = new ArrayList<>();
        for (String screenName : screenNames) {
            hashTags.add("*****************    " + screenName);
            List<String> hashTagsOfCurrentUser = twitterManager.getHashTags(screenName);
            hashTags.addAll(hashTagsOfCurrentUser);
        }

        ExcelManager.writeToExcel(hashTags);
    }

    public static void printScore() throws TwitterException {
        TwitterRestClient twitterRestClient = new TwitterRestClient();
        CategoryScore score = twitterRestClient.calculateScore("MissMalini");

        for(Map.Entry<CategoryEnum, Integer> entry : score.getScoreMap().entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
