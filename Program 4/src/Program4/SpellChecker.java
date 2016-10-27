/*
* INFO I-211/CSCI C-202
* MyList.java
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
     * @requires 
     * @ensures 
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
//                System.out.println("File reading: " + word);
                //insert into dictionary linked list hash at correct index
            } 
            input.close();
        } 
        catch (IOException e)
        { 
            System.out.println("File reading failed.");
        } 
    }
        
        
        
        /**
        * @requires 
        * @ensures 
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

                String[] splitLine = word.split(" ");
                
                StringBuilder sb = new StringBuilder();
                
                for (int i = 0; i < splitLine.length; i++) 
                {
                    for (int j = 0; j < splitLine[i].length(); j++) 
                    {
                        if (Character.isLetter(splitLine[i].charAt(i)))
                        {
                            sb.append(splitLine[i].charAt(i));
                        }
                        
                    }
                    System.out.println(sb.toString());
                    sb.setLength(0);
                    
                }
                
                if (!sb.toString().isEmpty())
                {
                    if (dictionary[word.charAt(0) - 97].contains(array))
                    {
                        wordsFound++;
                        compsFound = array[0];
                    }
                    else
                    {
                        wordsNotFound++; 
                        compsNotFound = array[0];
                    }
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
