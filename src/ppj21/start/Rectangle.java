package ppj21.start;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Rectangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return this.getA() * this.getB();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + this.getColor() +
                " a=" + a +
                ", b=" + b +
                '}';
    }
}
