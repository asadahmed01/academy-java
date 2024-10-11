package com.bptn.course._19_out_of_stock;

public class OutOfStockException extends Exception {
    // Modify the constructor below to take a String message parameter.   
    public OutOfStockException(String message) {
        // Call the superclass constructor passing the message parameter.
        super(message);
    }
}