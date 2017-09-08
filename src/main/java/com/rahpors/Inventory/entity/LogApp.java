package com.rahpors.Inventory.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ramon on 7/09/17.
 */
@Entity
@Table(name="log")
public class LogApp {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private Date date;

    @Column(name = "details")
    private String details;

    @Column(name = "username")
    private String username;

    @Column(name = "url")
    private String url;

    @Column(name = "method")
    private String method;

    public LogApp() {

    }

    public LogApp(Date date, String details, String username, String url, String method) {
        this.date = date;
        this.details = details;
        this.username = username;
        this.url = url;
        this.method = method;
    }


    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
