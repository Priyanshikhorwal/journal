package com.example.entity;


public class JournalEntity {
    private int id;
    private String title;
    private String description;
    private String date;
    private String lastUpdated;
    public int getId() {
        return id;
    }

    public JournalEntity(){
    }

    public JournalEntity( String title, String description,  String lastUpdated) {

        this.title = title;
        this.description = description;
        this.lastUpdated = lastUpdated;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setId(int id) {
        this.id = id;
    }

}
