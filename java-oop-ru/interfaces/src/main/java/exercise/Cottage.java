package exercise;

// BEGIN
public class Cottage implements Home{
    private  double area;
    private int floorCount;

    public  Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }
    public double getArea() {
        return  area;
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
        StringBuilder sb = new StringBuilder();
        sb.append(floorCount).append(" ");
        String floorCountSuffix;
        if (floorCount == 1) {
            floorCountSuffix = "этажный";
        } else {
            floorCountSuffix = "этажный";
        }
        sb.append(floorCountSuffix).append(" коттедж площадью ").append(getArea()).append(" метров");
        return sb.toString();
    }

}
// END
