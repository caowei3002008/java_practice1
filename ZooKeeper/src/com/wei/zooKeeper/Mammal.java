package com.wei.zooKeeper;

class Mammal {
    public int energyLevel;

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Mammal(){
        this.energyLevel = 100;
    }
    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
        if(this.energyLevel >100){
            this.energyLevel = 100;
        }
    }

    public void displayEnergy(){
        System.out.println("Energy is "+this.energyLevel);
    }
}
