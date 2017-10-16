package com.wei.master;
import java.util.ArrayList;

class Samurai extends human{
    public static int counter = 0;
    public Samurai(){
        this.health = 200;
        counter++;
    }

    public Samurai(int strength, int stealth, int intelligence, int health) {
        super(strength, stealth, intelligence, health);
        counter++;
    }

    public void deathBlow(human h){
        h.health = 0;
        System.out.println(h + "is dead.");
        this.health /= 2;
    }

    public void meditate(){
        this.health = this.health + this.health/2;
    }

    public void howMany(){
        System.out.println("The total number of Samurai is "+ counter++);
        }
    }


