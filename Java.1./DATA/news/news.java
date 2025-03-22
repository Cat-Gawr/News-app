package com.example.covid_19.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class News implements Serializable {

    @SerializedName("news_id")
    @Expose
    String news_id;
    @SerializedName("title")
    @Expose
    String title;
    @SerializedName("image")
    @Expose
    String image;
    @SerializedName("summary")
    @Expose
    String summary;
    @SerializedName("description")
    @Expose
    String description;
    @SerializedName("announcer")
    @Expose
    String announcer;
    @SerializedName("image_announcer")
    @Expose
    String image_announcer;
    @SerializedName("category")
    @Expose
    String category;
    @SerializedName("date")
    @Expose
    String date;

    public String getNews_id() {
        return news_id;
    }

    public void setNews_id(String news_id) {
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
