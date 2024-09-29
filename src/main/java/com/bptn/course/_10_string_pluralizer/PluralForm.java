package com.bptn.course._10_string_pluralizer;
import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create scanner object
		Scanner scanner = new Scanner(System.in);
		// amount
		int amt;
		String word;
		String pluralizedWord = "";
		// take amt
		System.out.println("# in: ");
		amt = scanner.nextInt();
		//flash the buffer
		scanner.nextLine();
		//take user input word
		System.out.println("word:");
		word = scanner.nextLine();
		//if the am is greater than 1
		if(amt> 1 ) {
			//if it ends in /..fe
			if(word.substring(word.length() -2).equals("fe")) {
				pluralizedWord = word.replace(word.substring(word.length() - 2), "ves");
			}else if(word.substring(word.length() -2).equals("sh") || word.substring(word.length() -2).equals("ch")) { // ends ..sh/ch
				pluralizedWord = word + "es";
			} else if(word.substring(word.length() -2).equals("us")) { // ends ..us
				pluralizedWord = word.replace(word.substring(word.length() - 2), "i");
			} else if(word.substring(word.length() -2).equals("ay") || word.substring(word.length() -2).equals("oy") || word.substring(word.length() -2).equals("ey")
					|| word.substring(word.length() -2).equals("uy")) {
				pluralizedWord = word + "s";
			} else if(word.substring(word.length() -1).equals("y")) { // if it ends in ..y
				pluralizedWord = word.replace(word.substring(word.length() - 1), "ies");
			} else {
				pluralizedWord = word + "s";
			}
			
				
		} else if(amt == 0) {
			pluralizedWord = word+"s";
		} else {
			pluralizedWord = word;
		}
		
		System.out.println(amt + " " + pluralizedWord);
		scanner.close();

	}

}
