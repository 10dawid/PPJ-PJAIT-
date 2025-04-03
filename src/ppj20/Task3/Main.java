package ppj20.Task3;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[9];
        people[0] = new Person("johny", "knoxwile", 1980);
        people[1] = new Person("mary", "knoxwile", 1990);
        people[2] = people[0].clonePerson();
        people[3] = people[0].clonePerson();
        people[4] = new Person("Donald", "Trump", 1900);
        people[5] = new Person("George", "Washington", 1990);
        people[6] = new Person("Tom", "Hill", 1939);
        people[7] = people[4].clonePerson();
        people[8] = people[1].clonePerson();


        Person[] noCopies = new Person[people.length];
        int noCopiesLength = 0;
        noCopies[0] = people[0];
        noCopiesLength += 1;

        boolean found = false;
        for(int i = 0; i < people.length; i++) {
            found = false;
            for(int j = 0; j < noCopiesLength; j++) {
                if(people[i].areSame(people[j])) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                noCopies[noCopiesLength] = people[i];
                noCopiesLength += 1;
            }
        }

        for (int i = 0; i < noCopiesLength; i++) {
            System.out.println(noCopies[i].name);

        }
    }
}