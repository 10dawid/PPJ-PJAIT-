package ppj9.Task7;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++){
            for (int j = 1; j <= 4; j++){
                if (i % 2 == 0) System.out.print(" *");
                else System.out.print("* ");
            }
            System.out.println();

        }
    }
}
