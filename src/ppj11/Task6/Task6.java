package ppj11.Task6;

public class Task6 {
    public static void main(String[] args) {
        int n = 6;
        for(int i = n; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (((j == 0) || (j == i)) && (i != n)) System.out.print("X");
                else if (i == n) System.out.print("X");
                else System.out.print("O");
            }
            System.out.println();
        }
    }
}
