package ppj22.Task1;

public class Person {
    String name;
    String surname;

    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }


}
