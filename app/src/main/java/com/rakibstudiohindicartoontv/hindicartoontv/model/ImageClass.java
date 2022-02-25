package com.rakibstudiohindicartoontv.hindicartoontv.model;

public class ImageClass {
    private int imageUrl;
    private String titleimage;

    public ImageClass(int imageUrl, String titleimage) {
        this.imageUrl = imageUrl;
        this.titleimage = titleimage;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitleimage() {
        return titleimage;
    }

    public void setTitleimage(String titleimage) {
        this.titleimage = titleimage;
    }
}