package com.example.pokedex;

import com.google.gson.annotations.SerializedName;

public class Sprite {

    @SerializedName("front_default")
    private String resourceUri;

    public Sprite() {

    }

    public String getResourceUri() {
        return resourceUri;
    }

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }
}
