package com.example.whatsapp.ModelClasses;

public class CallsModel {
    int ivImage;
    String tvName,tvCallTime;

    public CallsModel(int ivImage, String tvName, String tvCallTime) {
        this.ivImage = ivImage;
        this.tvName = tvName;
        this.tvCallTime = tvCallTime;
    }

    public int getIvImage() {
        return ivImage;
    }

    public void setIvImage(int ivImage) {
        this.ivImage = ivImage;
    }
    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public String getTvCallTime() {
        return tvCallTime;
    }

    public void setTvCallTime(String tvCallTime) {
        this.tvCallTime = tvCallTime;
    }
}
