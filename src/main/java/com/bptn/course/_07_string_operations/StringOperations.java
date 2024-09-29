package com.bptn.course._07_string_operations;

import java.util.*;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a scanner
		Scanner scanner = new Scanner(System.in);
		boolean continueOperations;
		do {
			System.out.println(" /…String Menu…/ ");
			
			System.out.println("Press 1 for Palindrome Check");
            System.out.println("Press 2 to reverse a String");
            System.out.println("Press 3 to Concatenate two Strings");
            System.out.println("Press 4 for String Comparison");
            System.out.println("Press 5 to Calculate the Length of String");
            // get user choice
            int choice = scanner.nextInt();
            scanner.nextLine();
            //variables to store strings
            String string1;
            String string2;
            
            // start the switch and perform tasks depending on the choice
            switch(choice) {
            case 1:
            	System.out.println("Palindrom Check");
            	System.out.println("Enter a string: ");
            	string1 = scanner.nextLine();
            	//reverse the input string
            	String reversed = new StringBuilder(string1.toLowerCase()).reverse().toString();
            	if(string1.equals(reversed)) {
            		System.out.println(string1 + " is a palindrome");
            	} else {
            		System.out.println(string1 + " is not a palindrom");
            	}
            	break;
            case 2:
            	System.out.println("Reverse a string");
            	System.out.println("Enter a string: ");
            	string1 = scanner.nextLine();
            	String reversed2 = new StringBuilder(string1.toLowerCase()).reverse().toString();
            	System.out.println(string1 + " reversed is " + reversed2);
            	break;
            	
            case 3:
            	System.out.println("Enter First string: ");
            	string1 = scanner.nextLine();
            	System.out.println("Enter Second string: ");
            	string2 = scanner.nextLine();
            	System.out.println(string1 + string2);
            	break;
            case 4:
            	System.out.println("String Comparison");
            	System.out.println("Enter First string:");
            	string1 = scanner.nextLine();
            	System.out.println("Enter Second string:");
            	string2 = scanner.nextLine();
            	if(string1.equals(string2)) {
            		System.out.println("The entered strings are equal");
            	} else {
            		System.out.println("The entered strings are not equal");
            	}
            	break;
            case 5:
            	System.out.println("Length of a string:");
            	System.out.println("Enter a string:");
            	string1 = scanner.nextLine();
            	System.out.println("The length of the entered string is:" + string1.length());
            	break;
            default:
                System.out.println("Invalid choice! Please make a valid choice.");
                break;
            	
            }
            
            System.out.print("To continue calculation press 1, else press any other number to exit: ");
            // get user choice
            int continueChoice = scanner.nextInt();
            continueOperations = (continueChoice == 1);
		} while (continueOperations);
		
		System.out.println("***************************************************************************");
        System.out.println("Calculator exited.");
	}
}
