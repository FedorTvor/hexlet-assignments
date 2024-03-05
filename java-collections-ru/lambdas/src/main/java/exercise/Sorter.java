package exercise;

import java.util.*;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {

    public static List<String> takeOldestMans(List<Map<String, String>> user) {
        return user.stream()
                .filter(u -> u.get("gender").equals("male"))
                .sorted(Comparator.comparing(u -> u.get("birthday")))
                .map(u -> u.get("name"))
                .collect(Collectors.toList());
    }
}
// END
