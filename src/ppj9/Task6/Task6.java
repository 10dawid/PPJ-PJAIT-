package ppj9.Task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input number");
        double number = scanner.nextDouble();
        int hundred = 0;
        int fifty = 0;
        int twenty = 0;
        int five = 0;
        while (number >= 1){
            number --;
            hundred++;
        }
        while (number >= 0.5){
            number -= 0.5;
            fifty++;
        }
        while (number >= 0.2){
            number -= 0.2;
            twenty++;
        }
        while (number >= 0.05){
            number -= 0.05;
            five++;
        }

        System.out.println("1zł "+hundred);
        System.out.println("50 gr "+fifty);
        System.out.println("20 gr "+twenty);
        System.out.println("5 gr "+five);

    }
}
