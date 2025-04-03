package ppj11.Task5;

public class Task5 {
    public static void main(String[] args) {

        int n = 25;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (((j == 1) || (j == i)) && (i != n)) System.out.print("X");
                else if (i == n) System.out.print("X");
                else  System.out.print("O");
            }
            System.out.println();
        }
    }
}
