package ppj20.Task2;

public class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10, "Test", 0.5);
        MyClass obj2 = new MyClass(1, 0.5, "Test");
        MyClass obj3 = new MyClass();
        System.out.println("obj2.getMyInt() = " + obj2.getMyInt());
        obj2.setMyInt(42);
        System.out.println("obj2.getMyInt() = " + obj2.getMyInt());
        obj1.show();
        obj2.show();
        obj3.show();
//        System.out.println(obj1.method1()); // 11 dla int = 10 double = 0,5
//        System.out.println(obj2.method1()); // 43 dla int = 1 double = 0,5
        System.out.println(MyClass.method2(obj1, obj2));
        System.out.println(MyClass.method2(obj1, obj2, obj3));
    }
}