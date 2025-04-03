package training.exceptions.training;


public class MethodClass {
    public static void printMyString(String input) throws CheckedExc{
        if (input.equals("abc")) throw new CheckedExc("i wont be checking abc you idiot");
        else if (input.length() == 1) throw new UncheckedExc("this aint even a String");
        else System.out.println("input = " + input);
    }
}
