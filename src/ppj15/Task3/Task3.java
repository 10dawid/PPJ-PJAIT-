package ppj15.Task3;

public class Task3 {
    public static void main(String[] args) {
        int a = getRandom(50);
        int b = getRandom(50,100);
        System.out.println(a);
        System.out.println(b);
    }
    public static int getRandom(int max) {
        return (int) (Math.random() * max);
    }
    public static int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
