/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author castuardo
 */
public class WordChecker {
    
    // This is the one that performs some stuff on the word.
    
    //1. Reverse: 
    public String reverseWord(String word){
        // Ill do this in a simple way. Its not the best way,
        // but is easy to understand
        String reversed = "";
        for(int i = word.length() - 1; i >= 0; --i){
            // we traverse the word backwards
            // and append
            reversed += word.charAt(i); // x +=y is the same as x = x + y
        }
        // ready
        return reversed;
    }
    
    //2. Is palindrome: 
    public boolean isPalindrome(String word){
        // Do you know what a palindrome is?
        // a palindrome is a word that when reversed looks just like the original,
        // like rotator. This operator: z = (x == y)? a : b assigns a to z if x == y is true
        // and b if false.
        return reverseWord(word).compareTo(word) == 0;
    }
    //3. Count letters: This one is more complicated. I will use a map
    // (set of key-value pairs without key repetition) to store. The idea
    // is that im going to count how many letters (and how many of them) 
    // does this word has
    public Map<Character, Integer> countLetters(String word){
        // this will hold the final result
        Map<Character, Integer> output = new HashMap<Character, Integer>();
        // go though all letters in the word
        for(int i = 0; i < word.length(); ++i){
            // so, if my output already contains the letter,
            // i increment the counter. If not, then i set it to 1 (cause i found one)
            if(output.containsKey(word.charAt(i))){
                output.put(word.charAt(i), output.get(word.charAt(i)) + 1);
            }
            // not contained
            else{
                output.put(word.charAt(i), 1);
            }
        }
        // we are ready counting. Can you think on other way to do this?
        // for example, with an array?
        return output;
    }
}
