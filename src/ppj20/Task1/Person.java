package ppj20.Task1;

public class Person {
    String name;
    String surname;
    int birthYear;

    Person(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public String toString(){
        return name + " " + surname + " " + birthYear;
    }

    public void toConsole(){
        System.out.println(this + " using `this` keyword");
        System.out.println(name + " " + surname + " " + birthYear+    " printing strings one by one");
        System.out.println(this.toString() + " using `this.toString()` keyword");
    }
}
