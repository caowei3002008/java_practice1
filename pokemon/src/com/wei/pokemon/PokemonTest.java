package com.wei.pokemon;

public class PokemonTest {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Pokemon p1 = new Pokemon("Pikachu", 100, "Electric");
        Pokemon p2 = new Pokemon("Charmander", 120, "Fire");
        Pokemon p3 = new Pokemon("Bulbasaur", 120, "Grass");

        Pokedex pokedex = new Pokedex();
        Pokemon p4 = pokedex.createPokemon("Squirtle", 120, "Water");
        pokedex.attackPokemon(p1);
        pokedex.attackPokemon(p2);
        pokedex.attackPokemon(p3);
        pokedex.attackPokemon(p3);
        pokedex.attackPokemon(p4);
        System.out.println(pokedex.pokemonInfo(p1));
        System.out.println(pokedex.pokemonInfo(p2));
        System.out.println(pokedex.pokemonInfo(p3));
        System.out.println(pokedex.pokemonInfo(p4));
    }
}
