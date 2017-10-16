package com.wei.pokemon;

public class Pokedex extends AbstractClass{

    public String pokemonInfo(Pokemon p){
        return "Name: "+p.getName()+", type: "+p.getType()+" ,health: "+p.getHealth();
    }
}
