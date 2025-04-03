package ppj20.Task1;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("john", "smith",1968);
        System.out.println("toString method below");
        System.out.println(john.toString()+ " --- using `john.toString()`");
        System.out.println(john + " --- using just `john`");


        System.out.println("\n-------------");
        System.out.println("toConsole method below");
        john.toConsole();

    }
}
