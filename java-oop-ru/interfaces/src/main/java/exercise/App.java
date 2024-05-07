package exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int n) {
        List<String> apartmentStrings = new ArrayList<>();
        if (apartments.isEmpty()) {
            return apartmentStrings;
        } else {
            Collections.sort(apartments, (a, b) -> Double.compare(a.getArea(), b.getArea()));
            List<Home> selectedApartments = apartments.subList(0, n);
            for (Home apartment : selectedApartments) {
                apartmentStrings.add(apartment.toString());
            }
        }
        return  apartmentStrings;


    }

}
// END
