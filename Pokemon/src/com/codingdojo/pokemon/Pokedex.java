package com.codingdojo.pokemon;

public class Pokedex extends AbstractPokemon implements PokeInterface{

	public String pokemonInfo(Pokemon target) {
		return "Name: " + target.getName() + ", Health: " + target.getHealth() + ", Type: " + target.getType();
	}
}
