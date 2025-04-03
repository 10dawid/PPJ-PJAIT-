package training.javaAccessModifiers.packageOne;

import training.javaAccessModifiers.packageTwo.C;

public class B {
    private String privateMessage = "This is a private message";

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
    }
}
