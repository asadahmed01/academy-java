package com.bptn.course.peer_tutor;

public class Snake extends Animal {
	
	private String venom;
	
	Snake(int numberOfLegs, String color, String name, String venom){
		super(numberOfLegs, color, name);
		this.venom = venom;
	}
	//snake crawl
	public String getVenom() {
		return venom;
	}
	
	public void setVenom(String newVenom) {
		this.venom = newVenom;
	}
	
	public void makeMove(String direction) {
		System.out.println("Snake is moving to " + direction);
	}
	
	public void makeMove(String direction, int distance) {
		System.out.println("Snake is moving to "+ direction + "by " + distance);
	}
	
	public int add(int a, int b) {
		return a +b;
	}
	
	public double add(int x, double y) {
		return x + y;
	}
	
	
	//override the makesound method
	
	public void makeSound() {
		System.out.println("snakes hiss");
	}
	
	
	
}
