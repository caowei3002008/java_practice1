package com.wei.web.models;

public class dog extends animal implements pet{
    public dog(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;

    }

    public String showAffection(){
        if(this.weight<30){
            return getName()+" hopped into your lap and cuddled you!";
        }else{
            return getName()+" curled up next to you!";
        }
    }


}
