package wyklad.no_2.remind;

public class Main {
    public static void main(String[] args) {
        A a1 = new A(10, "egg");
        A a2 = new A(10, "egg");
        System.out.println(a1); // works only when toString method defined

        System.out.println(a1==a2); // false because compares two adresses
        System.out.println(a1.equals(a2)); // true coz compares values




    }
}
