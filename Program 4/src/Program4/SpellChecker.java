/*
* INFO I-211/CSCI C-202
* SpellChecker.java
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

public class SpellChecker {
    
    protected long wordsFound;
    protected long wordsNotFound;
    protected long compsFound;
    protected long compsNotFound;
    MyLinkedList[] dictionary = new MyLinkedList[26];
    
    int[] array = new int[1]; 
    
    
    public SpellChecker()
    {
        for (int i = 0; i < dictionary.length; i++) 
        {
            dictionary[i] = new MyLinkedList<String>();
        }
    }
    
    
    /**
    * @requires the String form of the name of the dictionary that is to be read.
    * @ensures all the words in the dictionary will be put into each of their 
    * respective nodes based on alphabetical order of the words. Each of the 26
    * nodes will contain all the words that begin with the same respective 
    * letter in alphabetical order. 
    */
    public void populateDictionary(String fname)
    { 
        File f = new File (fname);
        
        try
        { 
            Scanner input = new Scanner(f);
            
            String word = "";
                       
            while (input.hasNext())  
            { 
                word = input.nextLine().toLowerCase(); 
                
                dictionary[word.charAt(0) - 97].add(word);  
            } 
            input.close();
        } 
        catch (IOException e)
        { 
            System.out.println("File reading failed.");
        } 
    }
        
    
        /**
        * @requires the String form of the name of the file that is to be read.
        * @ensures the file will be read in line by line and will check to see 
        * whether or not each word is spelled correctly. Will count the words 
        * found, the words not found, the comparisons taken to find the words 
        * found, and the comparisons taken to find the words not found. 
        */
        public void populateTextFile(String fname)
        { 
        File f = new File (fname);
        
        try
        { 
            Scanner input = new Scanner(f);
            
            while (input.hasNext())  
            { 
                String word = input.nextLine().toLowerCase();                 
                
                String[] stringArray = word.split(" ");
                
                StringBuilder sb = new StringBuilder();
                
                for (int i = 0; i < stringArray.length; i++) 
                {
                    for (int j = 0; j < stringArray[i].length(); j++) 
                    {
                        if (Character.isLetter(stringArray[i].charAt(j)))
//                        if ((Character.isLetter(stringArray[i].charAt(j))) 
//                                || (stringArray[i].charAt(j) == 96))
                                
                        {
                            sb.append(stringArray[i].charAt(j));
                        }  
                    }   
                    
                    if (!sb.toString().isEmpty())
                    {
                        if (dictionary[sb.charAt(0) - 97].contains(sb.toString(), array))
                        {
//                            if (dictionary[sb.charAt(0) - 97].contains(sb.toString(), array))
//                            {
//                                wordsFound++;
//                                compsFound = compsFound + array[0]; 
//                            }
                                
                            wordsFound++;
                            compsFound = compsFound + array[0];  
                        }
                        
                        else
                        {
                            wordsNotFound++;
                            compsNotFound = compsNotFound + array[0];
                        }
                    }
                    //System.out.println(sb.toString());
                    sb.setLength(0);
                }
            } 
            input.close();
        } 
        catch (IOException e)
        { 
            System.out.println("File reading failed.");
        } 
        
        
        
        
        
        
        
        
        
        
        
        
        
    } 
    
}
