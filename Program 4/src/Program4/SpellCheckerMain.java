/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        
        
//        for (int i = 0; i < a.dictionary[5].size() ; i++) {
//            System.out.println(a.dictionary[5].get(i));
//            
//        }
        
        
        a.populateTextFile("Oliver.txt");
        
        for (int i = 0; i < a.dictionary[5].size() ; i++) {
            System.out.println(a.dictionary[5].get(i));
            
        }
        
        
        
        
        
        
        if ( list.contains(wordToBeSearched, i))
        {
            wordsFound++;
            compsFound += count[0];
        }
        else
        {
            wordsNotFound++;
            compsNotFound += count[0];
        }


        
        
        

        
        
        
        
        
        
    }
}
