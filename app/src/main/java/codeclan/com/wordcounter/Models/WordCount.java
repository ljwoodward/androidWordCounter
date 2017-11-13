package codeclan.com.wordcounter.Models;

/**
 * Created by janemackay on 13/11/2017.
 */

public class WordCount {

    private String string;

    public WordCount(String string){
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public int countWords() {
        String[] words = this.string.split("\\s+");
        return words.length;
    }
}
