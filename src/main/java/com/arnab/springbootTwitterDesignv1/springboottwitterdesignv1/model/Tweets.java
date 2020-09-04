package com.arnab.springbootTwitterDesignv1.springboottwitterdesignv1.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="tweets")
public class Tweets {

    private Long user_ID;
    private Long tweet_ID;
    private String tweet_title;
    private String tweet_body;
    private String upvote_count;
    private String downvote_count;
    private Long created_by;
    private Date created_at;
    private Long edited_by;
    private Date edited_at;
    private boolean active_status;

    public Tweets() {

    }

    public Tweets(Long user_ID, Long tweet_ID, String tweet_title,
                  String tweet_body, String upvote_count,
                  String downvote_count, Long created_by,
                  Date created_at, Long edited_by, Date edited_at,
                  boolean active_status) {
        super();
        this.user_ID = user_ID;
        this.tweet_ID = tweet_ID;
        this.tweet_title = tweet_title;
        this.tweet_body = tweet_body;
        this.upvote_count = upvote_count;
        this.downvote_count = downvote_count;
        this.created_by = created_by;
        this.created_at = created_at;
        this.edited_by = edited_by;
        this.edited_at = edited_at;
        this.active_status = active_status;
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

    public boolean isActive_status() {
        return active_status;
    }

    public void setActive_status(boolean active_status) {
        this.active_status = active_status;
    }
}
