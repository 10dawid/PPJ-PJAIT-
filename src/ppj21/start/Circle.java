package ppj21.start;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + "{" + "radius=" + radius + '}';
    }
}
