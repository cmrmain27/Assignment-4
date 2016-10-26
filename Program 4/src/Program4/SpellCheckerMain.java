/*
* INFO I-211/CSCI C-202
* SpellCheckerMain.java
* Purpose: This program is create a spellchecker that will compare each word in 
* a sent-in file with a dictionary of correctly spelled words to determine 
* whether or not a word is spelled properly. The purpose of this program is to 
* show how Linked Lists in programming can solve real-world problems. 
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
        System.out.println("Counter Display...");
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("Words Found: " + a.wordsFound);
        System.out.println("");
        System.out.println("Words Not Found: " + a.wordsNotFound);
        System.out.println("");
        System.out.println("Average Comparisons Found: " + (a.compsFound/a.wordsFound));
        System.out.println("");
        System.out.println("Average Comparisons Not Found: " + (a.compsNotFound/a.wordsNotFound));

        
        
        
        
        
        
    }
}
