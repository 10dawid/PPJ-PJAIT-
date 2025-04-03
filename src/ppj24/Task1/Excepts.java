package ppj24.Task1;

public class Excepts {
    public static void main (String[] args) throws Explosion {
        Car car = new Car();
        while (true) {
            try {
                car.drive100km();
            } catch(NotEnoughGas e) {
                System.out.println(e.getMessage());
                car.fill();
            }
        }
    }
}