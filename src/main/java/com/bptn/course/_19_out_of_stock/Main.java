package com.bptn.course._19_out_of_stock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();
	    try {
	        store.purchase("apple",11);
	        System.out.println("Purchase successful!");
	    } catch (OutOfStockException e) {
	        System.out.println(e.getMessage());
	    }

	}

}
