package com.wei.zooKeeper;

class Dragon extends Mammal{

    public Dragon(){
        this.energyLevel = 300;
    }

    public Dragon(int energyLevel){
        this.energyLevel = energyLevel;
        if(this.energyLevel >300){
            this.energyLevel = 300;
        }
    }

    public void fly(){
        System.out.println("Fly!");
        this.energyLevel -=50;
    }

    public void eatHumans(){
        System.out.println("Eat Humans");
        this.energyLevel +=25;

    }

    public void attackTown(){
        System.out.println("Attack Town");
        this.energyLevel -=100;
    }


}
