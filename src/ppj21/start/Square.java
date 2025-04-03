package ppj21.start;

public class Square extends Rectangle {

    public Square(String color, double side) {
        super(color, side, side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + this.getColor() +
                " side=" + this.getA() +
                '}';
    }

}
