package ppj21.task1;

public class Person {
    private String name;
    private Car car;

    Person(String name){
        this.name = name;
        this.car = null;
    }
    Person(String name, Car car){
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString(){
        return name + " " + (car == null ? "" : car.toString());
    }

    public static Car[] getCars(Person[] persons){
        int carNum = 0;
        for (int i = 0; i < persons.length; i++){
            if (persons[i].getCar() != null) carNum++;
        }
        Car[] cars = new Car[carNum];
        int carIndex = 0;
        for (int i = 0; i < persons.length; i++){
            if (persons[i].getCar() != null) cars[carIndex++] = persons[i].getCar();
        }
        return cars;
    }

    public static Car[] expensiveCars(Person[] persons, int minPrice){
        int carNum = 0;
        for (Person person : persons) {
            if (person.getCar() != null && person.getCar().getPrice() >= minPrice) {
                carNum++;
            }
        }

        Car[] cars = new Car[carNum];
        int carIndex = 0;

        for (Person person : persons) {
            if (person.getCar() != null && person.getCar().getPrice() >= minPrice) cars[carIndex++] = person.getCar();
        }
        return cars;
    }

    public static int getPrice(Person[] persons, String name) {
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                if (person.getCar() != null) return person.getCar().getPrice();
                else return -1;
            }
        }
        return -2;
    }
}
