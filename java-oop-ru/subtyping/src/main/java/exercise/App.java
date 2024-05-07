package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

// BEGIN
public class App {

    public static <T extends KeyValueStorage> void swapKeyValue(T storage) {
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : storage.toMap().entrySet()) {
            tempMap.put(entry.getValue(), entry.getKey());
        }
        storage.clear();
        storage.putAll(tempMap);
    }
}
// END
