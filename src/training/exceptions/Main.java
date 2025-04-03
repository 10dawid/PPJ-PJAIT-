package training.exceptions;

public class Main{
    public static void main(String[] args) {
        try{
            int myInt = Integer.parseInt("word");
        } catch (NumberFormatException | NullPointerException e) {
            // catching multiple exceptions
            System.out.println("there was an exception");
            System.out.println(e.getMessage());
        }

        System.out.println();

        try{
            printInt("1234");
        }
        catch (NumberFormatException nfe){
            System.out.println("NumberFormatException");
        }

        System.out.println();

        try{
            printInt("abc");
        }
        catch (NumberFormatException nfe){
            System.out.println("NumberFormatExcepiton");
        }


    }
    public static void printInt(String input){
        int myInt = Integer.parseInt(input);
        System.out.println("myInt = " + myInt);
    }
}




// classes
//java.lang.Object
//    java.lang.Throwable
//        java.lang.RuntimeException
//            java.lang.IllegalArgumentException