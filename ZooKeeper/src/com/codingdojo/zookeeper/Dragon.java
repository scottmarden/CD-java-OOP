package com.codingdojo.zookeeper;

public class Dragon extends Mammal{
	public Dragon() {
		energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("*WHOOOOOSH*");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("*CRUNCHCRUNCHCRUNCH*");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("TROGDOOOOOOOOOOOR");
		energyLevel -= 100;
	}
}
