package ppj18.Task2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Johnny";
        person.surname = "Knoxville";
        person.age = 46;
        person.weight = 85;
        person.birthYear = 1990;

        System.out.println(person.name);
        System.out.println(person.surname);
        System.out.println(person.age);
        System.out.println(person.weight);
        System.out.println(person.birthYear);
    }
}
