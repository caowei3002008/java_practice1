package com.wei.zooKeeper;

public class Main {

    public static void main(String[] args) {
        Gorilla g1 = new Gorilla(90);
        g1.throwSomething();
        g1.showEnergy();
        g1.throwSomething();
        g1.showEnergy();
        g1.throwSomething();
        g1.showEnergy();
        g1.eatBananas();
        g1.climb();
        g1.showEnergy();
        g1.displayEnergy();
        g1.displayEnergy();
        Dragon d1 = new Dragon();
        d1.displayEnergy();
        Dragon d2 = new Dragon(250);
        d2.displayEnergy();
        d1.attackTown();
        d1.attackTown();
        d1.attackTown();
        d1.eatHumans();
        d1.eatHumans();
        d1.fly();
        d1.fly();
        d1.displayEnergy();
    }
}
