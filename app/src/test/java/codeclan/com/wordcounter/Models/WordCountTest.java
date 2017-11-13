package codeclan.com.wordcounter.Models;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.wordcounter.Models.WordCount;

import static org.junit.Assert.*;

/**
 * Created by janemackay on 13/11/2017.
 */
public class WordCountTest {

    String myString;
    WordCount wordCount;
    String myString2;
    WordCount wordCount2;

    @Before
    public void before() {
        myString = new String("This sentence contains five words.");
        wordCount = new WordCount(myString);

        myString2 = new String("It was the best of times, it was the worst of times, it was " +
                "the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, …");
        wordCount2 = new WordCount(myString2);


    }

     @Test
    public void testWordCount() {
        int actual = wordCount.countWords();
        assertEquals(5, actual);
    }


}