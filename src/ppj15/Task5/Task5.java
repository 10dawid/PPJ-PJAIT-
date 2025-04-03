package ppj15.Task5;

public class Task5 {
    public static void main(String[] args) {
        int[] a = getFibonacci(10);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static int[] getFibonacci(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        if (n > 1) fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
}
