package training.kolokwiumOstatnieZadanie;

public class Main {
    public static void main(String[] args) {
        A a = new A("Start", 3.14);
        B b = new B("Here", 5.67, 42);
        C c = new C("End", 21.37, "Here");
        A[] arr = {a, b, c};
        arr[1].setA("Begin");
        for (A obj : arr) {
            System.out.println(obj);
        }
    }
}
