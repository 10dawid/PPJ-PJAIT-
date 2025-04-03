package training.javaAccessModifiers.packageTwo;

import training.javaAccessModifiers.packageOne.A;

public class Asub extends A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.dafaultMessage);
        // this worked because we are in the same package as C class

        System.out.println(c.publicMessage);

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);
    }
}
