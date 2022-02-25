package com.rakibstudiohindicartoontv.hindicartoontv.model;

public class StaticVideoClass {

    private String videoTitle;
    private int imageUrl;
    private String videoID;
    private String catagory;

    public StaticVideoClass(String videoTitle, int imageUrl, String videoID, String catagory) {

        this.videoTitle = videoTitle;
        this.imageUrl = imageUrl;
        this.videoID = videoID;
        this.catagory = catagory;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoID() {
        return videoID;
    }

    public void setVideoID(String videoID) {
        this.videoID = videoID;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
}