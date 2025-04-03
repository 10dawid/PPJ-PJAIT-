package training.exceptions.UncheckedNotion;

public class MethodWithUncheckedException {
    public static void myMethod(){
        throw new MyUncheckedException("This is my Unchecked Exception");
    }
}
