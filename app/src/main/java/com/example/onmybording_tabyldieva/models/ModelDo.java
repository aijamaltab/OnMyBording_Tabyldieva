package com.example.onmybording_tabyldieva.models;

import com.google.gson.annotations.SerializedName;

public class ModelDo {
    @SerializedName("key")
    private String key;

    @SerializedName("type")
    private String type;

    @SerializedName("activity")
    private String activity;

    @SerializedName("price")
    private Double price;
    @SerializedName("link")
    private String link;
    @SerializedName("participants")
    private int participants;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }
}
