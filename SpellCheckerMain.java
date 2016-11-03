/*
* INFO I-211/CSCI C-202
* SpellCheckerMain.java
* Purpose: This program is designed to read in a dictionary as a Linked List  
* according the first letters of each word, read in a file, check to see if 
* each word in the file is found in the dictionary, and increments counters 
* depending on words found, words not found, comparisons found, and 
* comparisons not found. This program applies the use of LinkedLists to a 
* real world problem. 
* 
* Dr. Hettiarachchi
* Cody Main 
* October 21-25, 2016
*/ 

package Program4;

import java.util.*;
import java.io.*;


public class SpellCheckerMain {
    
    public static void main(String[] args) {
    
        long wordsFound;
        long wordsNotFound;
        long compsFound;
        long compsNotFound;
        
        
        SpellChecker a = new SpellChecker();
        
        a.populateDictionary("random_dictionary.txt");
        
        a.populateTextFile("Oliver.txt");
        
        
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("Counter Testing...");
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("Number of Words Found: " + (double) a.wordsFound);
        System.out.println("");
        System.out.println("Number of Words Not Found: " + (double) a.wordsNotFound);
        System.out.println("");
        System.out.println("Average Comparisons Found: " + (double) a.compsFound / (double) a.wordsFound);
        System.out.println("");
        System.out.println("Average Comparisons Not Found: " + (double) a.compsNotFound / (double) a.wordsNotFound);
        System.out.println("");
        System.out.println("=================================================");
                
    }
}
