package exercise;

// BEGIN
public class App {

    public static void printSquare(Circle circle) {
        double square = 0;
        try {
            square = circle.getSquare();
        } catch (NegativeRadiusException e) {
            System.out.println("Не удалось посчитать площадь" + "\nВычисление окончено");
            return;
        }

        if (square > 0) {
            System.out.println(Math.round(square) + "\nВычисление окончено");
        } else {
            System.out.println("Не удалось посчитать площадь" + "\nВычисление окончено");
        }
    }

}
// END
