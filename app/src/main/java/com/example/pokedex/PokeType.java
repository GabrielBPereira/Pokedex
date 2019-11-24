package com.example.pokedex;

import com.google.gson.annotations.SerializedName;

public class PokeType {

    @SerializedName("slot")
    private int slot;

    @SerializedName("type")
    private Type type = new Type();

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}