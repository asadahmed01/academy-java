package com.bptn.course._06_calculator;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation;

        do {
            // Display the calculator menu
            System.out.println("...Calculator Menu...");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to square a number");
            System.out.println("Press 6 to find a square root");
            System.out.println("Press 7 to find the reciprocal");
            System.out.print("Select an option: ");
            //get user choice
            int choice = scanner.nextInt();

            double num1 = 0;
            double num2 = 0;

            // Get input based on choice and perform tasks
            switch (choice) {
                case 1:
                	System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("The sum of the numbers " + num1 + " and " + num2 + " is = " + (num1 + num2));
                    break;
                case 2:
                	System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("The difference of the numbers " + num1 + " and " + num2 + " is = " + (num1 - num2));
                    break;
                case 3:
                	System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + (num1 * num2));
                    break;
                case 4:
                	System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                    	double quotient = num1 / num2;
                        double remainder = num1 % num2;
                        System.out.println("Dividing " + num1 + " by " + num2 + " the quotient is " + quotient);
                        System.out.println("The remainder is " + remainder);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                	System.out.print("Enter the number to square: ");
                    num1 = scanner.nextDouble();
                    System.out.println("The square of " + num1 + " is = " + (num1 * num1));
                    break;
                case 6:
                	System.out.print("Enter the number to find square root for: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        System.out.println("The square root of " + num1 + " is = " + Math.sqrt(num1));
                    } else {
                        System.out.println("Error: Cannot find the square root of a negative number.");
                    }
                    break;
                case 7:
                	System.out.print("Enter the number to find the reciprocal: ");
                    num1 = scanner.nextDouble();
                    if (num1 != 0) {
                        System.out.println("The reciprocal of " + num1 + " is = " + (1 / num1));
                    } else {
                        System.out.println("Error: Cannot find the reciprocal of zero.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid option selected.");
                    break;
            }

            // Continue or exit
            System.out.print("To continue calculation press 1, else press any other number to exit: ");
            // get user choice
            int continueChoice = scanner.nextInt();
            continueCalculation = (continueChoice == 1);

        } while (continueCalculation);

        scanner.close();
        System.out.println("***************************************************************************");
        System.out.println("Calculator exited.");
    }
}

