package com.wei.web.models;

public class cat extends animal implements pet{



    public cat(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;

    }

    public String showAffection(){
        return "Your "+getBreed()+" cat, "+getName()+", looked at you with some affection. Your think.";
    }
}
