package training.finalTraining.JavaAccessModifiers;


public class Main {
    public static void main(String[] args) {
        A a = new A();
        ChildA child = new ChildA();


        child.printFromParent();
        child.printPrivate();
        a.printPrivate();

    }
}
