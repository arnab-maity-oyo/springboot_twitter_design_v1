package com.arnab.springbootTwitterDesignv1.springboottwitterdesignv1.model;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_ID;

    private String first_name;
    private String last_name;
    private String password;
    private String email;
    private Double lat;
    private Double lon;
    private Long created_by;
    private Date created_at;
    private Long edited_by;
    private Date edited_at;
    private Boolean active_status;

    @OneToMany(mappedBy = "users")
//    @JoinColumn(name="user_ID", referencedColumnName = "user_ID")
    List<Tweets> tweetsList = new ArrayList<>();

    public Users() {

    }

    public Users(Long user_ID, String first_name, String last_name,
                 String password, String email, Double lat, Double lon, Long created_by,
                 Date created_at, Long edited_by, Date edited_at,
                 Boolean active_status) {
        super();
        this.user_ID = user_ID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.email = email;
        this.lat = lat;
        this.lon = lon;
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

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
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

    public Boolean isActive_status() {
        return active_status;
    }

    public void setActive_status(Boolean active_status) {
        this.active_status = active_status;
    }

    public List<Tweets> getTweetsList() {
        return tweetsList;
    }

    public void setTweetsList(List<Tweets> tweetsList) {
        this.tweetsList = tweetsList;
    }
}
