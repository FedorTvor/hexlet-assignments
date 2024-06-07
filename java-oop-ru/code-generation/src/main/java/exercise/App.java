package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {

    // ... (методы save() и extract() остаются без изменений)

    public static void save(Path path, Car car) throws JsonProcessingException, IOException {
        String json = car.serialize();
        Files.writeString(path, json);
    }

    public static Car extract(Path path) throws IOException, JsonProcessingException {
        String json = Files.readString(path);
        return Car.unserialize(json);
    }
}