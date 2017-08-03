package com.influencer.service.twitter;

import org.springframework.stereotype.Service;
import twitter4j.*;

@Service
public class TwitterRestClient {

    public void fetchUserInfo(String name) throws TwitterException {
        Twitter twitter = new TwitterFactory().getInstance();

        ResponseList<Status> missMalini = twitter.getUserTimeline("MissMalini", new Paging(1, 200));

        System.out.println(missMalini.get(0).getText());
    }
}
