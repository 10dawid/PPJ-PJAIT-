package training.finalTraining.JavaAccessModifiers;

public class ChildA extends A{
    public void printFromParent(){
        System.out.println("super.nullInt = " + super.nullInt);
        System.out.println("super.protectedInt = " + super.protectedInt);
        System.out.println("super.publicInt = " + super.publicInt);
    }
}
