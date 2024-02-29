package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static void main(String[] args) {
    }
    public static Long getCountOfFreeEmails(List<String> emails) {
        var freeDomein = List.of("@gmail.com", "@yandex.ru", "@hotmail.com");
        return emails.stream()
                .map(domeins -> domeins.substring(domeins.lastIndexOf("@")))
                        .filter(freeDomein::contains)
                        .count();
    }
}
// END
