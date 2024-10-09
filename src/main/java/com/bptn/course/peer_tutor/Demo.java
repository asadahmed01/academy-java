package com.bptn.course.peer_tutor;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = Animal.getPassword();
		
		//System.out.println(password);
		
		
		
		Animal animal = new Animal(4, "black", "Dog");
		
//		System.out.println(animal.getName());
//		System.out.println(animal.getColor());
		
		animal.setNumberOfLegs(3);
		
		//System.out.println(animal.getNumberOfLegs());
		animal.makeSound();
		
		
		//snake object
		Snake snake = new Snake(0, "gray", "snake", "poison");
		
		//System.out.println(snake.getVenom());
		//snake.makeSound();
		snake.makeMove("North", 2);

	}

}
