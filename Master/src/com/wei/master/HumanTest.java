package com.wei.master;

public class HumanTest {

    public static void main(String[] args) {
        human h1 = new human();
        human h2 = new human();
        h1.attack(h2);
        h1.displayHealth();
        h2.displayHealth();
        Samurai s1 = new Samurai();
        Samurai s2 = new Samurai();
        Samurai s3 = new Samurai();
        Samurai s4 = new Samurai();
        Samurai s5 = new Samurai();
        s1.howMany();
        s1.deathBlow(h1);
        s1.displayHealth();
        h1.displayHealth();
    }
}
