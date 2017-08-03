package com.codingdojo.objectmaster;

public class Samurai extends Human {
	
	private static int counter;
	
	public Samurai() {
		this.health = 200;
		counter++;
	}
	
	public void deathBlow(Human target) {
		target.health = 0;
		this.health -= this.health/2;
	}
	
	public void meditate() {
		this.health += this.health/2;
	}
	
	public static void howMany() {
		System.out.println("There are " + counter + " Samurais.");
	}
}


