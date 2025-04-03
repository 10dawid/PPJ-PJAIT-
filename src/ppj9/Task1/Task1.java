package ppj9.Task1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input a, b and c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max  = Math.max(a, b);
        if (c > max) max = c;

        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
        for(int i = 0; i < b; i++) {
            System.out.print("*");
        }
        System.out.println();
        for(int i = 0; i < c; i++) {
            System.out.print("*");
        }
        System.out.println("\n");

        for(int i = max; i > 0; i--) {
            if (a == i) {
                System.out.print("*");
                a--;
            }
            else System.out.print(" ");

            if (b == i){
                System.out.print("*");
                b--;
            }
            else System.out.print(" ");

            if(c == i){
                System.out.print("*");
                c--;
            }
            else System.out.print(" ");
            System.out.println();
        }

    }

}
