package com.codingdojo.objectmaster;

public class CombatTest {

	public static void main(String[] args) {
		Human h1 = new Human();
		Ninja n1 = new Ninja();
		Samurai s1 = new Samurai();
		Wizard w1 = new Wizard();
		
		h1.displayHealth();
		w1.fireball(h1);
		h1.displayHealth();
		w1.heal(h1);
		h1.displayHealth();
		s1.deathBlow(h1);
		h1.displayHealth();
		s1.displayHealth();
		n1.attack(s1);
		s1.displayHealth();
		n1.steal(s1);
		s1.displayHealth();
		n1.displayHealth();
	}

}
