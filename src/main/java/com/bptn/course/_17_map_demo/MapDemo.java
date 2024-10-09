package com.bptn.course._17_map_demo;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> numbers = new HashMap<>();
		// Add key-value pairs to the Map
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        numbers.put(6, "six");
        numbers.put(7, "seven");
        numbers.put(8, "eight");
        numbers.put(9, "nine");
        numbers.put(10, "ten");
        
        //print the hashmap
        for(Map.Entry<Integer, String> entry : numbers.entrySet()) {
        	System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
     // remove() method to remove the value whose key is 7
        numbers.remove(7);
        
     // Add another key-value pair for eleven
        numbers.put(11, "eleven");
        
     // Print out the map to verify changes
        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

	}

}
