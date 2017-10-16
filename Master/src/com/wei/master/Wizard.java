package com.wei.master;

class Wizard extends human{
    public Wizard(){
        this.health = 50;
        this.intelligence = 8;
    }

    public Wizard(int strength, int stealth, int intelligence, int health) {
        super(strength, stealth, intelligence, health);
    }

    public void heal(human h){
        System.out.println("Heal!!!");
        h.health +=this.intelligence;
    }
    public void fireball(human h){
        System.out.println("Fire Ball!!!");
        h.health -=this.intelligence*3;
    }


}
