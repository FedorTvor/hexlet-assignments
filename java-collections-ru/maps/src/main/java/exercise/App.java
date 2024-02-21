package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App{
    public static void main(String[] args) {
    }
    public static Map<String, Integer> getWordCount(String text) {
        var result = new HashMap<String, Integer>();
        var masWords = text.split(" ");
        if (masWords.length-1 != 0 ) {
            for (var i = 0; i < masWords.length ; i++) {
                if (result.containsKey(masWords[i])) {
                    result.put(masWords[i], result.get(masWords[i]) + 1);
                } else {
                    result.put(masWords[i], 1);
                }
            }
        }
        return result;
    }
    public static String toString(Map<String, Integer> wordCount) {

        if (wordCount.isEmpty()) {
            return "{}";
        } else {
            var result = "{\n";
            for (var entry : wordCount.entrySet()) {
                result = result + "  " + entry.getKey() + ": " + entry.getValue() + "\n";
            } return result + "}";
        }
    }
}
//END
