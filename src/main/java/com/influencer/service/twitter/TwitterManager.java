package com.influencer.service.twitter;

import com.influencer.parser.TextParser;
import org.springframework.stereotype.Service;
import twitter4j.*;
import twitter4j.api.TrendsResources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class TwitterManager {
    private Twitter twitter = new TwitterFactory().getInstance();

    public TrendsResources getDailyTrendingHashTags() {
        TrendsResources trends = twitter.trends();
        return trends;
    }

    public List<String> getHashTags(String screenName) throws TwitterException {
        ResponseList<Status> responseList = twitter.getUserTimeline(screenName, new Paging(1, 200));


        List<String> hashTags = new ArrayList<>();
        Iterator<Status> iterator = responseList.iterator();
        while (iterator.hasNext()) {
            HashtagEntity[] hashtagEntities = iterator.next().getHashtagEntities();
            for (HashtagEntity hashtagEntity : hashtagEntities) {
                hashTags.add(hashtagEntity.getText());
            }
        }

        return hashTags;
    }

}
