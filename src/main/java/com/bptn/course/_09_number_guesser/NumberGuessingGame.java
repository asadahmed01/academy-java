package com.bptn.course._09_number_guesser;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create scanner object
		Scanner scanner = new Scanner(System.in);
		//get the target number
		int targetNumber = (int) (Math.random() * 100) + 1;
		System.out.println(targetNumber);
		int guess;
		do {
			System.out.println("Enter a guess: ");
			guess = scanner.nextInt();
			//if guess is higher than the targetNumber
			if(guess > targetNumber) {
				System.out.println("Too high! Try again.");
			} else if(guess <targetNumber) {
				System.out.println("Too low! Try again.");
			} else {
				System.out.println("Congratulations! You guessed the number correctly!");
			}
		} while(guess != targetNumber);
		
		//close scanner
		scanner.close();
	}

}
