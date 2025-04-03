package ppj22.bonus.Task3;

public class Person {
    private String name;
    private Car car;

    public Person(String name) {
        this.name = name;
        this.car = null;
    }
    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }
    public Car getCar() {
        return car;
    }

    public boolean haveCar() {
        if (car != null) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }

    public static Car[] getCars(Person[] persons) {
        int numberOfCars = 0;
        for (Person person : persons) {
            if (person.haveCar()) numberOfCars++;
        }
        Car[] cars = new Car[numberOfCars];
        int index = 0;
        for(Person person: persons) {
            if (person.haveCar()) cars[index++] = person.getCar();
        }
        return cars;
    }

    public static Car[] expensiveCars(Person[] persons, int minPrice){
        int numberOfCars = 0;
        for(Person person : persons)
            if (person.haveCar() && person.getCar().getPrice() >= minPrice) numberOfCars++;

        Car[] cars = new Car[numberOfCars];
        int index = 0;
        for(Person person: persons) {
            if (person.haveCar() && person.getCar().getPrice() >= minPrice) cars[index++] = person.getCar();
        }
        return cars;
    }

    public static int getPrice(Person[] persons, String name) {
        for (Person person : persons) {
            if (person.getName().equals(name)){
                if (person.haveCar()) return person.getCar().getPrice();
                else return -1;
            }
        }
        return -2;
    }
}
