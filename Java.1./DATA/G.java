package com.example.covid_19.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Favorite {
    @PrimaryKey(autoGenerate = true)
    int news_id;
    @ColumnInfo(name = "title")
    String title;
    @ColumnInfo(name = "image")
    String image;
    @ColumnInfo(name = "summary")
    String summary;
    @ColumnInfo(name = "description")
    String description;
    @ColumnInfo(name = "announcer")
    String announcer;
    @ColumnInfo(name = "image_announcer")
    String image_announcer;
    @ColumnInfo(name = "category")
    String category;
    @ColumnInfo(name = "date")
    String date;

    public int getNews_id() {
        return news_id;
    }

    public void setNews_id(int news_id) {
        this.news_id = news_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnnouncer() {
        return announcer;
    }

    public void setAnnouncer(String announcer) {
        this.announcer = announcer;
    }

    public String getImage_announcer() {
        return image_announcer;
    }

    public void setImage_announcer(String image_announcer) {
        this.image_announcer = image_announcer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
