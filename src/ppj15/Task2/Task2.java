package ppj15.Task2;

public class Task2 {
    public static void main(String[] args) {
        int wrt = 5;
        System.out.println("before --> " + wrt);
        modifyValue(wrt);
        System.out.println("after ---> " + wrt);
    }
    public static void modifyValue(int wrt) {
        System.out.println("inside modifyValue wrt beforte --> " + wrt);
        wrt *= 5;
        System.out.println("inside modifyValue wrt after --> " + wrt);
    }
}
