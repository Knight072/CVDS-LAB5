package com.xv.consumeapi;

public class User {
    private Integer userid;
    private Integer id;
    private String title;
    private boolean completed;

    public Integer getUserId() {
        return userid;
    }
    public void setUserId(Integer id) {
        this.userid = id;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean getCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {this.completed = completed;}
}
