package ppj21.task1;

public class Car {
    private String make;
    private int price;

    Car(String make, int price) {
        this.make = make;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return make + " " + price;
    }
}
