package com.example.listview;

public class Candies {

    private int resourceImage;
    private String description;

    public Candies(int resourceImage, String description) {
        this.resourceImage = resourceImage;
        this.description = description;
    }

    public int getResourceImage() {
        return resourceImage;
    }

    public void setResourceImage(int resourceImage) {
        this.resourceImage = resourceImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
