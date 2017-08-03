package com.codingdojo.objectmaster;

public class Ninja extends Human {
	
	public Ninja() {
		stealth = 10;
	}
	
	public void steal(Human target) {
		System.out.println("Stealing...");
		target.health -= this.stealth;
		this.health += this.stealth;
	}
	
	public void runAway() {
		this.health -= 10;
	}

}
