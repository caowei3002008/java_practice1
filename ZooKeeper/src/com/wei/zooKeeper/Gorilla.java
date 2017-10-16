package com.wei.zooKeeper;

class Gorilla extends Mammal{

    public Gorilla(int energy){
        this.energyLevel = energy;
    }

    public void throwSomething(){
        this.energyLevel -= 5;
    }
    public void eatBananas(){
        this.energyLevel +=10;
    }
    public void climb(){
        this.energyLevel -=10;
    }

    public void showEnergy(){
        System.out.println("The energy level is "+this.energyLevel);
    }
}
