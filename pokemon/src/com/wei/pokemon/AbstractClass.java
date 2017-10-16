package com.wei.pokemon;

public abstract class AbstractClass {

    public Pokemon createPokemon(String name, int health, String type){
        return new Pokemon(name, health, type);
    }

    public void attackPokemon(Pokemon p){
        int health = p.getHealth() - 10;
        p.setHealth(health);
    }


}
