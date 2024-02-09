package com.example.series_review;

public class DataModel {

    private String name;
    private String description;
    private int id_;
    private int image;

    public DataModel(String name, String version, int id_, int image) {
        this.name = name;
        this.description = version;
        this.id_ = id_;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return description;
    }

    public void setVersion(String version) {
        this.description = version;
    }

    public int getId_() {
        return id_;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
