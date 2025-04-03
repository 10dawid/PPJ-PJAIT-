package training.finalTraining.JavaAccessModifiers;

public class A {
    private int privateInt = 10;
    public int publicInt = 15;
    int nullInt = 20;
    protected int protectedInt = 50;
    
    public void printPrivate(){
        System.out.println("this.privateInt = " + this.privateInt);
    }
}
