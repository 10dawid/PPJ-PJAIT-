package training.exceptions.training.weirdCase;

public class NumPr {
    public static int returnNumber(){
        try{
            return 3;
        } catch (Exception e) {
            return 5;
        }
        finally {
            return 1;
        }
    }
    public static void printNumber(){
        try {
            System.out.println("insude try block");
        }
        catch (Exception e){
            System.out.println("inside catch block");
        }
        finally {
            System.out.println("insude finally block");
        }
    }


    public static void main(String[] args) {
        int a  = returnNumber();
        System.out.println("a = " + a);
        System.out.println();
        printNumber();
    }
}
