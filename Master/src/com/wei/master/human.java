package com.wei.master;

class human {
    public int strength;
    public int stealth;
    public int intelligence;
    public int health;

    public human(){
        this.stealth = 3;
        this.strength = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    public human(int strength, int stealth, int intelligence, int health) {
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    public void attack(human h){
        h.health -= this.strength;
    }

    public void displayHealth(){
        System.out.println("The current health is " + this.health);
    }
}
