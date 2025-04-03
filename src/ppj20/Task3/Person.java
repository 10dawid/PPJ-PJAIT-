package ppj20.Task3;

public class Person {
    String name;
    String surname;
    int birthYear;

    Person(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public Person clonePerson() {
        return new Person(name, surname, birthYear);
    }

    public boolean areSame(Person person) {
        if (this.name.equals(person.name) && this.surname.equals(person.surname)) {
            if (this.birthYear == person.birthYear) {
                return true;
            }
        }
        return false;
    }
}
