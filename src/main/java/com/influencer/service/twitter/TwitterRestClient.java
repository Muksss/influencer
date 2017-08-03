package com.influencer.service.twitter;

import com.influencer.model.CategoryScore;
import com.influencer.parser.TextParser;
import org.springframework.stereotype.Service;
import twitter4j.*;

import java.util.Iterator;

@Service
public class TwitterRestClient {
    private Twitter twitter = new TwitterFactory().getInstance();

    public Twitter getTwitter() {
        return twitter;
    }

    public CategoryScore calculateScore(String screenName) throws TwitterException {
        CategoryScore score = getCategoryScoreFromTweets(screenName);
        score.merge(getCategoryScoreFromDescription(screenName));
        return score;
    }

    public CategoryScore getCategoryScoreFromTweets(String screenName) {
        CategoryScore categoryScore = new CategoryScore();
        try {
            ResponseList<Status> responseList = twitter.getUserTimeline(screenName, new Paging(1, 200));
            Iterator<Status> iterator = responseList.iterator();

            while (iterator.hasNext()) {
                TextParser.parseText(iterator.next().getText(), categoryScore);
            }
            return categoryScore;
        } catch (TwitterException e) {
            e.printStackTrace();
        }

        return categoryScore;
    }

    public CategoryScore getCategoryScoreFromDescription(String screenName) throws TwitterException {
        User user = twitter.showUser(screenName);
        return TextParser.parseText(user.getDescription(), new CategoryScore());
    }

    public static void main(String[] args) throws TwitterException {
        TwitterRestClient twitterRestClient = new TwitterRestClient();
        CategoryScore score = twitterRestClient.calculateScore("MissMalini");
        System.out.println("");
    }
}
