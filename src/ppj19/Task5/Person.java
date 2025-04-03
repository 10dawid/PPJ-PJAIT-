package ppj19.Task5;

import java.time.Year;

public class Person {
    String name;
    int yearBirth = 1980;

    Person(String name, int yearBirth){
        this.name = name;
        this.yearBirth = yearBirth;
    }
    Person(String name){
        this.name = name;
    }

    public String returnName(){
        return name;
    }

    public int returnAge(){
        return Year.now().getValue() - yearBirth;
    }

    public Person returnOlderPerson(Person person1, Person person2){
        if (person1.returnAge() > person2.returnAge()){
            return person1;
        }
        return person2;
    }

    public Person returnOldestPerson(Person[] persons){
        int oldest = persons[0].returnAge();
        Person oldestPerson = persons[0];
        for(int i = 0; i < persons.length; i++){
            if (persons[i].returnAge() > oldest){
                oldest = persons[i].returnAge();
                oldestPerson = persons[i];
            }
        }
        return oldestPerson;
    }
}
