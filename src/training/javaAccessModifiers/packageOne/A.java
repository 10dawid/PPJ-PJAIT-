package training.javaAccessModifiers.packageOne;

import training.javaAccessModifiers.packageTwo.C;

public class A {
    protected String protectedMessage = "This is protected message, works only for subclasess";

    public static void main(String[] args) {
        C c = new C();
//        System.out.println(c.defaultMessage); this does not work because
        // it only allows us to use the variable within the same package or the same class
        // as we are in packageOne and the C class is in packageTwo this wont work

        System.out.println(c.publicMessage);

        B b = new B();
//        System.out.println(b.privateMessage); // this wont work because private modifier
        //only allows us to use a variable within the same class
    }
}
