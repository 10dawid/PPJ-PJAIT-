package training.exceptions.note;

public class Main {
    public static void main(String[] args) {
        try{
            MethodWithCheckedException.myMethod();
        } catch (MyCheckedException mce) {
            System.out.println(mce.getMessage());
        }
    }
}
