package training.finalTraining.OverrideOrOverload;

public class Main {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();

        System.out.println("myclass.sum() = " + myclass.sum());
        System.out.println("myclass.sum(10) = " + myclass.sum(10));
        System.out.println(myclass);
    }
}
