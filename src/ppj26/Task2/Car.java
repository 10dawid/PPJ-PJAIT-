package ppj26.Task2;

import java.awt.*;

public class Car {
    private String make;
    private Color color;

    public Car(String make, Color color) {
        this.make = make;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", color=" + color +
                '}';
    }
}
