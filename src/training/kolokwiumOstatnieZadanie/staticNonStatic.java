package training.kolokwiumOstatnieZadanie;

public class staticNonStatic {
    int x = 10;
    public static void printMyX(){
//        System.out.println(x);

    }

    public static void main(String[] args) {
        printMyX();
        //non-static variable cannot be referenced from a static context
    }
}
