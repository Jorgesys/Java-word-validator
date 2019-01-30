package com.jorgesys;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class StaticWordLibrary extends WordLibrary {

    final static WordLibrary DEFAULT = new StaticWordLibrary();

    /**
     * Singleton class.
     */
    public StaticWordLibrary() {
    }

    public Set<String> getWords(){
        try {                                              
                String line = "";
                FileReader fileReader = new FileReader("./src/com/jorgesys/words.txt");
                BufferedReader bufferedReader =  new BufferedReader(fileReader);                                
                Set<String> wordsSet = new HashSet<>();
                while((line = bufferedReader.readLine()) != null) {
                       wordsSet.add(line);
                }                       
                bufferedReader.close();                                       
                return wordsSet;
           } catch (IOException ex) {
               System.out.println("error getWords() : " + ex.getMessage());
          }    
        return null;
  }
    
    
    public boolean isCorrectWord(String word){                                                              
               Set<String> wordsSet = getWords();                 
               if(wordsSet.contains(word.toLowerCase())){                   
                         return true;   
               }else{
                   return false;        
               }                                  
     }
        

}
