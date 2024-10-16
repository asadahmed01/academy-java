package com.bptn.course._24_junit_books;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Do not modify this code. Please update the other files in the tabs above.
	        Textbook tb = new Textbook("Computer Science", 14.99, 9);
	        Textbook tb2 = new Textbook("Basketweaving", 19.99, 2);
	        
	        System.out.println("Title: " + tb.getTitle());
	        System.out.println("Edition: " + tb.getEdition());
	        System.out.println("Book Info: " + tb.getBookInfo());
	        System.out.println("Can substitute for tb2: " + tb.canSubstituteFor(tb2));

	        System.out.println("\nTitle: " + tb2.getTitle());
	        System.out.println("Edition: " + tb2.getEdition());
	        System.out.println("Book Info: " + tb2.getBookInfo());
	        System.out.println("Can substitute for tb: " + tb2.canSubstituteFor(tb));

	}

}
