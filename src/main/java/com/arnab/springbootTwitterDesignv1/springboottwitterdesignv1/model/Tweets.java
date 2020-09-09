package com.arnab.springbootTwitterDesignv1.springboottwitterdesignv1.model;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "tweets")
public class Tweets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tweet_ID;

    private Long user_ID;
    private String tweet_title;
    private String tweet_body;
    private Double lat;
    private Double lon;
    private String upvote_count;
    private String downvote_count;
    private Long created_by;
    private Date created_at;
    private Long edited_by;
    private Date edited_at;
    private Boolean active_status;
    private Boolean draft_status;

    @ManyToOne
    private Users users;

    public Tweets() {

    }

    public Tweets(Long user_ID, Long tweet_ID, String tweet_title,
                  String tweet_body, Double lat, Double lon, String upvote_count,
                  String downvote_count, Long created_by,
                  Date created_at, Long edited_by, Date edited_at,
                  Boolean active_status, Boolean draft_status) {
        super();
        this.user_ID = user_ID;
        this.tweet_ID = tweet_ID;
        this.tweet_title = tweet_title;
        this.tweet_body = tweet_body;
        this.lat = lat;
        this.lon = lon;
        this.upvote_count = upvote_count;
        this.downvote_count = downvote_count;
        this.created_by = created_by;
        this.created_at = created_at;
        this.edited_by = edited_by;
        this.edited_at = edited_at;
        this.active_status = active_status;
        this.draft_status = draft_status;
    }

    public Long getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(Long user_ID) {
        this.user_ID = user_ID;
    }

    public Long getTweet_ID() {
        return tweet_ID;
    }

    public void setTweet_ID(Long tweet_ID) {
        this.tweet_ID = tweet_ID;
    }

    public String getTweet_title() {
        return tweet_title;
    }

    public void setTweet_title(String tweet_title) {
        this.tweet_title = tweet_title;
    }

    public String getTweet_body() {
        return tweet_body;
    }

    public void setTweet_body(String tweet_body) {
        this.tweet_body = tweet_body;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getUpvote_count() {
        return upvote_count;
    }

    public void setUpvote_count(String upvote_count) {
        this.upvote_count = upvote_count;
    }

    public String getDownvote_count() {
        return downvote_count;
    }

    public void setDownvote_count(String downvote_count) {
        this.downvote_count = downvote_count;
    }

    public Long getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Long created_by) {
        this.created_by = created_by;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Long getEdited_by() {
        return edited_by;
    }

    public void setEdited_by(Long edited_by) {
        this.edited_by = edited_by;
    }

    public Date getEdited_at() {
        return edited_at;
    }

    public void setEdited_at(Date edited_at) {
        this.edited_at = edited_at;
    }

    public Boolean getActive_status() {
        return active_status;
    }

    public void setActive_status(Boolean active_status) {
        this.active_status = active_status;
    }

    public Boolean getDraft_status() {
        return draft_status;
    }

    public void setDraft_status(Boolean draft_status) {
        this.draft_status = draft_status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tweets)) return false;
        Tweets tweets = (Tweets) o;
        return tweet_ID.equals(tweets.tweet_ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tweet_ID);
    }
}
