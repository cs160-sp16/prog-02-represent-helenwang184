package com.example.helenwang.ivote;

/**
 * Created by helenwang on 3/2/16.
 */
public class Legislator {
    private String name;
    private String party;
    private String position;
    private String email;
    private String website;
    private int picture;
    private String tweet;
    private String termEnds;
    private String committees;
    private String bills;

    public Legislator(String name, String party, String position, String email, String website, int picture, String tweet, String termEnds, String committees, String bills) {
        super();
        this.name = name;
        this.party = party;
        this.position = position;
        this.email = email;
        this.website = website;
        this.picture = picture;
        this.tweet = tweet;
        this.termEnds = termEnds;
        this.committees = committees;
        this.bills = bills;
    }


    public String getName() {
        return name;
    }

    public String getParty() {
        return party;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getPicture() {
        return picture;
    }

    public String getWebsite() {
        return website;
    }

    public String getTweet() {
        return tweet;
    }

    public String getTermEnds() {
        return termEnds;
    }

    public String getCommittees() {
        return committees;
    }

    public String getBills() {
        return bills;
    }
}
