package com.example.whatsapp.ModelClasses;

public class FragmentChatModel {
    int image;
    String name,message,time;

    public FragmentChatModel(int image, String name, String message, String time) {
        this.image = image;
        this.name = name;
        this.message = message;
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTitle(String time) {
        this.time = time;
    }
}
