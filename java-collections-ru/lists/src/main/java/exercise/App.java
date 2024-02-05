package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static void main(String[] args) {

    }
    public static boolean scrabble(String charSet, String word) {
        String[] masCharSet = charSet.toLowerCase().split("");
        String[] masWord = word.toLowerCase().split("");
        List<String> listMasCS = Arrays.asList(masCharSet);
        List<String> listMasW = Arrays.asList(masWord);
        var result = new ArrayList<>(listMasW);
        if (listMasW.isEmpty()) {
            return false;
        } else {
            for (var step1: listMasCS) {
                    if (result.contains(step1)) {
                        result.remove(step1);
                    }
            }
        }

        return result.isEmpty();
    }
}
//END
