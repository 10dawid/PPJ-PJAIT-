package training.inheritance;

public class Parent {
    protected int age;
    int favNum;

    public Parent(int age, int favNum){
        this.age = age;
        this.favNum = favNum;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "age=" + age +
                ", favNum=" + favNum +
                '}';
    }
}
