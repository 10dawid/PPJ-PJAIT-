package ppj23.Task4;

public class Student {
    private String name;
    private int sNumber;

    public Student(String name, int sNumber) {
        this.name = name;
        this.sNumber = sNumber;
    }

    public void show(){
        System.out.println(this.name + " " + this.sNumber);
    }
}
