package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	public Gorilla() {
	}
	
	public void throwThing() {
		System.out.println("The Gorilla threw something!");
		energyLevel -= 5;
	}
	
	public void eatBanana() {
		System.out.println("The gorilla ate a banana! Delicious!");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("The gorilla is climbing a tree!");
		energyLevel -= 10;
	}
	
}
