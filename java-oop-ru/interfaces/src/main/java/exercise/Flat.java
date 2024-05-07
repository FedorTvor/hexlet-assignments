package exercise;

// BEGINthe
public class Flat implements Home {
    private double area;
    private  double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return  area + balconyArea;
    }

    public int compareTo(Home other) {
        if (getArea() < other.getArea()) {
            return  -1;
        } else if (getArea() == other.getArea()) {
            return  0;
        } else {
            return 1;
        }
    }

    public String toString() {
/*        StringBuilder areaString = new StringBuilder(Double.toString(getArea()));
        if (areaString.indexOf(".") > 0) {
            areaString.insert(areaString.indexOf(".") + 1, 2);
        } else {
            areaString.append(".0");
        }
        return "Квартира площадью " + areaString + " метров на " + floor + " этаже";
    }

 */
        return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
    }
}
// END
