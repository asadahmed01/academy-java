package com.bptn.course.peer_tutor;

public class Animal {
	
	// Attributes are just variable
	private int numberOfLegs;
	private String color;
	private String name;
	
	static String password = "1223";
	
	
	//Constructor
	Animal(int numberOfLegs, String color, String name){
		this.numberOfLegs = numberOfLegs;
		this.color = color;
		this.name = name;
		
	}
	
	
	//behaviours methods
	public void makeSound() {
		System.out.println("a dog barks");
	}
	
	// Getter methods
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	
	//setter methods
	public void setNumberOfLegs(int newNumberOfLegs) {
		this.numberOfLegs = newNumberOfLegs;
	}
	
	
	//STATIC METHOD
	static String getPassword() {
		return password;
	}
	
}


/*
 * 
 * class has two main things
 *  1. attributes (properties)
 */