package com.codingdojo.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		Human h3 = new Human();
		
		h1.displayHealth();
		h2.attack(h1);
		h3.attack(h1);
		h1.displayHealth();
	}

}
