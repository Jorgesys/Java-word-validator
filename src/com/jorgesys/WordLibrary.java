package com.jorgesys;

import java.util.Set;

/**
 * Interface defining logic for the application.
 */
public abstract class WordLibrary {
    /**
     * Constructor for subclasses.
     */
    protected WordLibrary() {
    }
    
    public static WordLibrary getDefault() {
        return StaticWordLibrary.DEFAULT;
    }

    public abstract boolean isCorrectWord(String word);
    public abstract Set<String> getWords();
}
