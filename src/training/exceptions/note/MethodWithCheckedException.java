package training.exceptions.note;

public class MethodWithCheckedException {
    public static void myMethod() throws MyCheckedException{
        throw new MyCheckedException("This is MyCheckedException");
    }
}
