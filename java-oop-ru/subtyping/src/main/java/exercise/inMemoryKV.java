package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class inMemoryKV implements KeyValueStorage {

    private final Map<String, String> storage;

    public inMemoryKV(Map<String, String> initialData) {
        this.storage = new HashMap<>(initialData);
    }

    @Override
    public void set(String key, String value) {
        storage.put(key, value);
    }

    @Override
    public void unset(String key) {
        storage.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return storage.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(storage);
    }

    @Override
    public void clear() {
        storage.clear();
    }

    @Override
    public void putAll(Map<String, String> swappedData) {
        storage.putAll(swappedData);
    }
}
// END
