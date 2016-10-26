/*
* INFO I-211/CSCI C-202
* MyArrayList.java
* Purpose: To create a LinkedList and LinkedList methods without using 
* java.util.*; in order to understant how LinkedList works. 
* 
* Dr. Hettiarachchi
* Cody Main 
* October 18-21, 2016
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
    
    
    
    public SpellChecker()
    {
        for (int i = 0; i < dictionary.length; i++) 
        {
            dictionary[i] = new MyLinkedList<String>();
        }
    }
    
    
    
    
    
    
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
        
        
        
        
        public void populateTextFile(String fname)
        { 
        File f = new File (fname);
        
        try
        { 
            Scanner input = new Scanner(f);
            
            
                       
            while (input.hasNext())  
            { 
                String word = input.nextLine().toLowerCase(); 
                
                if (dictionary[word.charAt(0) - 97].contains(word))
                {
                    wordsFound++;
                    compsFound = compsFound + i;
                }
                
                
                
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
