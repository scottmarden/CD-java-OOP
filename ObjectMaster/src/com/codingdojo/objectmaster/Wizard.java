package com.codingdojo.objectmaster;

public class Wizard extends Human {
	
	public Wizard() {
		health = 50;
		intelligence = 8;
	}
	
	public void heal(Human target) {
		System.out.println("Healing");
		target.health += this.intelligence;
	}
	
	public void fireball(Human target) {
		System.out.println("Fireballing");
		target.health -= (this.intelligence*3);
	}
}
