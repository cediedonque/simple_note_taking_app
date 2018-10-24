package com.donque.simplenotetakingapp;

public class note {
    private long id = 1;
    private String title = "";
    private String body = "";
    private String createAt = "";
    private String updateAt = "";

    public note(long id, String title, String body, String createAt, String updateAt) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.createAt = createAt;
        this.updateAt = updateAt;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }
}