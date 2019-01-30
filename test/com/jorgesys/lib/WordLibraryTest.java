package com.jorgesys.lib;

import com.jorgesys.WordLibrary;
import java.util.Arrays;
import junit.framework.TestCase;

/**
 * Test of the functionality of {@link WordLibrary}.
 */
public class WordLibraryTest extends TestCase {
    WordLibrary wordLibrary;

    public WordLibraryTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
        wordLibrary = WordLibrary.getDefault();
    }
    
    
}
