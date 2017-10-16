package com.wei.master;

class Ninja extends human{
    public Ninja(){
        this.stealth = 10;
    }

    public Ninja(int strength, int stealth, int intelligence, int health) {
        super(strength, stealth, intelligence, health);
    }

    public void steal(human h){
        System.out.println("Steal");
        h.health -= this.stealth;
        this.health += this.stealth;
    }

    public void runAway(){
        System.out.println("Run Away!!!");
        this.health -= 10;
    }


}
