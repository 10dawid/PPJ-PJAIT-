package ppj9.Task3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        int maxDigitSum = 0;
        int maxN = 0;
        while (n != 0) {
            System.out.println("input positive number or zero to stop");
            n = scanner.nextInt();
            int temp = n;
            int digitSum = 0;

            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }

            if (digitSum > maxDigitSum) {
                maxDigitSum = digitSum;
                maxN = n;
            }
        }
        System.out.println("Max sum of digit was " + maxDigitSum+ " for "+ maxN);

    }
}
