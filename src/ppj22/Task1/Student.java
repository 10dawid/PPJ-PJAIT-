package ppj22.Task1;

public class Student extends Person {
    int s;

    Student(String name, String surname, int s) {
        super(name, surname);
        this.s = s;
    }

    @Override
    public String toString(){
        return super.toString() + " " + s;
    }
}
