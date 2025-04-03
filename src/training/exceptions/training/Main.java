package training.exceptions.training;

public class Main {
    public static void main(String[] args) {
        String first = "abc";
        String second = "i love java";
        String third = "a";
        String fourth = "String number 4";

        {
            try {
                MethodClass.printMyString(first);
            } catch (CheckedExc ce) {
                System.out.println(ce.getMessage());
            }
            System.out.println("first one caused chcecked exception");
        }
        System.out.println();
        {
            try {
                MethodClass.printMyString(second);
            } catch (CheckedExc ce) {
                System.out.println(ce.getMessage());
            }
        }
        System.out.println("this worked out fine");
        System.out.println();

        {
            try {
                MethodClass.printMyString(third);
            } catch (CheckedExc ce) {
                System.out.println(ce.getMessage());
            } finally {
                System.out.println("insude finally block");
            }
        }

        {
            System.out.println("this line wont be printed because we bumped into unchecked exception");
            try {
                MethodClass.printMyString(fourth);
            } catch (CheckedExc ce) {
                System.out.println(ce.getMessage());
            }
        }
    }
}
