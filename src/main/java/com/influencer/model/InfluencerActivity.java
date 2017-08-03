package com.influencer.model;


public class InfluencerActivity {

    private int id;

    private Category category;

    private InfluencerInfo influencerInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public InfluencerInfo getInfluencerInfo() {
        return influencerInfo;
    }

    public void setInfluencerInfo(InfluencerInfo influencerInfo) {
        this.influencerInfo = influencerInfo;
    }
}
