package com.codingdojo.pokemon;

public abstract class AbstractPokemon implements PokeInterface {
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon newPokemon = new Pokemon(name, health, type);
		return newPokemon;
	}
	
	public void attackPokemon(Pokemon target) {
		target.setHealth(target.getHealth()-10);
	}
}
