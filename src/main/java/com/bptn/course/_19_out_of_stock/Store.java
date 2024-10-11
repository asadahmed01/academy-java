package com.bptn.course._19_out_of_stock;

import java.util.HashMap;
import java.util.Map;

public class Store {
    
    // create the map instance variable
    HashMap<String, Integer> products;
    
    public Store() {
        // Initialize the products map with default values      
        products = new HashMap<>();
        products.put("apple", 10);
        products.put("banana", 5);
        products.put("orange", 0); 
    }

    public void purchase(String product, int quantity) throws OutOfStockException {
        // Check if the product is available in the store. Hint: Use the map
        if (!products.containsKey(product)){
            // If not, throw an OutOfStockException with a message indicating the product is not available.
            throw new OutOfStockException(product + " is out of stock at the moment.");
            
        }
        // Check if there is enough stock for the desired quantity. Hint: Use the map
        if (products.get(product) < quantity){
            // If not, throw an OutOfStockException with a message indicating the product is out of stock.  
            throw new OutOfStockException("requested quantity is greater than quantity available in stock");  
        }
    }
}

