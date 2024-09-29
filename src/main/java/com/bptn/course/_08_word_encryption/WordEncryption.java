package com.bptn.course._08_word_encryption;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instantiate new Scanner object
		Scanner scanner = new Scanner(System.in);
		//get user input
		System.out.println("Enter a string to encrypt: ");
		String word = scanner.nextLine();
		
		StringBuilder encryptedWord = new StringBuilder();
		//loop through the user input char by char
		for(int i = 0; i < word.length(); i++) {
			//convert each char to ascii value
			char shiftedLetter = word.charAt(i);
			int currentChar = (int) word.charAt(i);
			
			// Lower Case
			if(currentChar >= 'a' && currentChar <= 'z') {
				//Check for wrapping of 'z' to 'a'
				if (currentChar == 'z') {
					shiftedLetter = 'a';
				} else {
					shiftedLetter = (char)(currentChar +1);
				}
			} else if(currentChar == 122) {
				currentChar = 97;
			} else {
				currentChar = currentChar + 1;
			}
			
			//Upper Case
			if(currentChar == 'A' && currentChar == 'Z') {
				//check for wrappping of 'A' to Z
				if(currentChar == 'Z') {
					shiftedLetter = 'A';
				} else {
					shiftedLetter = (char)(currentChar + 1);
				}
			}
			encryptedWord.append(shiftedLetter);
			
		}
		
		
		//display the encrypted string
		System.out.println("Encrypted word: " + encryptedWord);
		//close scanner
		scanner.close();

	}

}
