package training.inheritance;

public class Child extends Parent{
    String favColor;

    public Child(int age, int favNum, String favColor){
        super(age, favNum);
        this.favColor = favColor;
    }
    public void printAgeMethodInChildClass(){
        System.out.println(super.age);
    }
}
