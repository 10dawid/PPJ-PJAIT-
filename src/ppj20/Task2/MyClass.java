package ppj20.Task2;

public class MyClass {
    int MyInt;
    double MyDouble;
    String MyString;

    MyClass(int myInt, double MyDouble, String MyString) {
        this.MyInt = myInt;
        this.MyDouble = MyDouble;
        this.MyString = MyString;
    }
    MyClass(int MyInt, String MyString, double MyDouble) {
        this.MyInt = MyInt;
        this.MyDouble = MyDouble;
        this.MyString = MyString;
    }
    MyClass(){
        MyString = "Value of my int is 0";
        MyInt = 0;
        MyDouble = 0;
    }

    public int getMyInt() {
        return MyInt;
    }
    public void setMyInt(int newInt) {
        MyInt = newInt;
    }
    public void show(){
        System.out.println("MyClass{myInt=" + MyInt + ", myDouble=" + MyDouble + ", MyString=" + MyString + "}");
    }


    public static String method2(MyClass obj1, MyClass obj2){
        return obj1.MyString +" "+ obj2.MyString;
    }
    public static String method2(MyClass obj1, MyClass obj2, MyClass obj3){
        return obj1.MyString +" "+ obj2.MyString +" "+ obj3.MyString;
    }
}
