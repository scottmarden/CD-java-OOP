package com.codingdojo.pokemon;

public interface PokeInterface {
	Pokemon createPokemon(String name, int health, String type);
	void attackPokemon(Pokemon target);
	String pokemonInfo(Pokemon target);
}

