package com.wei.pokemon;

public interface OperatePokemon {
    Pokemon createPokemon(String name, int health, String type);
    void attackPokemon(Pokemon p);
    String pokemonInfo(Pokemon p);

}
