package ppj22.bonus.Task2;

public class Main {
    public static void main (String[] args) {
        int[] a = {1, 4, 5, 7, 9, 10};
        for (int i = a[0]; i <= a[a.length-1]; ++i)
            System.out.printf("what=%2d ind=%2d%n", i, Bin.binSearchRec(a, i, 0, a.length));
        System.out.println("**************");
        int[] b = {-1,1,3,4,6};
        for (int i = b[0]; i <= b[b.length-1]; ++i)
            System.out.printf("what=%2d ind=%2d%n", i, Bin.binSearchRec(b, i, 0, b.length));
        }
    }
