package ppj26.Task2;

import java.awt.*;

public class Person {
    private String name;
    private int birthYear;
    private Car car;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.car = null;
    }
    public Person(String name, int birthYear, Car car){
        this.name = name;
        this.birthYear = birthYear;
        this.car = car;
    }

    @Override
    public String toString() {
        return name + " was born in " + birthYear +
                (car != null?
                        " and has a " + this.car.getMake() + " in " + this.car.getColor() + "." :
                        ".");
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Car getCar() {
        return car;
    }
    public static Car[] findAllCars(Person[] persons){
        int numOfCars = 0;
        for(Person person : persons)
            if (person.getCar() != null) numOfCars++;
        Car[] cars = new Car[numOfCars];
        int index = 0;
        for (Person person : persons){
            if (person.getCar() != null){
                cars[index++] = person.getCar();
            }
        }
        return cars;
    }
    public static Person[] findOwners(Person[] persons, String make){
        int count = 0;
        for(Person person : persons){
            if (person.getCar() != null)
                if (person.getCar().getMake().equals(make)) count++;
        }
        int index = 0;
        Person[] owners = new Person[count];
        for(Person person : persons){
            if (person.getCar() != null)
                if (person.getCar().getMake().equals(make)){
                    owners[index++] = person;
                }
        }
        return owners;
    }
    public static Color findColor(Person[] persons, String name, int year){
        for(Person person : persons){
            if (person.getName().equals(name))
                if (person.getBirthYear() == year)
                    if (person.getCar() != null)
                        return person.getCar().getColor();
        }
        return null;
    }
}
