package ppj21.start;

public class Shape {

    private String color;


    public String getColor() {
        return color;
    }

    public Shape(String color) {
        this.color = color;
    }

    public double getArea(){
        return Double.NaN;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "color='" + color + '\'' +
                '}';
    }
}
