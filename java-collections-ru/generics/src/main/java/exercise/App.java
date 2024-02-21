package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {

    public static void main(String[] args) {

    }
    public static List<Map<String, String>> findWhere(List<Map<String,String>> books, Map<String, String> text) {
        List<Map<String, String >> resul = new ArrayList<>();
        for (var book: books) {
            var allText = true;
            for (var tex: text.entrySet()) {
                var key = tex.getKey();
                var value = tex.getValue();
                if (!book.containsKey(key) || !book.get(key).equals(value)) {
                    allText = false;
                    break;
                }
            }
            if (allText) {
                resul.add(book);
            }
        }
        return resul;
    }
}
//END
