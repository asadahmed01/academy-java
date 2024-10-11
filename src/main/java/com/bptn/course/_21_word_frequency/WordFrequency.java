package com.bptn.course._21_word_frequency;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "This is a test sentence with no repeating words";

        // Split the sentence into words using split() method
        String[] splitWords = sentence.split(" ");

        // Create a Map to store the frequency of each word
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Iterate through each word in the sentence
        for (String word : splitWords) {
            // If the word is already in the map, increment its frequency 
            if (wordFrequency.containsKey(word)) {
                // Get the current frequency and increment it by 1
                int frequency = wordFrequency.get(word);
                wordFrequency.put(word, frequency + 1);
            }
            // If the word is not in the map, add it with a frequency of 1
            else {
                wordFrequency.put(word, 1);
               
            }
        }

        // Print the frequency of each word
        System.out.println("Word frequency: " + wordFrequency);
    }
}

