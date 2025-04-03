package ppj19.Task5;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 2000);
        System.out.println("person1.returnName() = " + person1.returnName());
        System.out.println("person1.returnAge() = " + person1.returnAge());
        Person person2 = new Person("Mike");
        System.out.println("person2.returnName() = " + person2.returnName());
        System.out.println("person2.returnAge() = " + person2.returnAge());


        System.out.println(person1.returnOlderPerson(person1, person2).returnName()+ " is older one.");
        Person person3 = new Person("Jacob", 1942);
        Person[] persons = new Person[]{person1, person2, person3};

        System.out.println(person1.returnOldestPerson(persons).returnName()+" is the oldest guy");
    }
}
