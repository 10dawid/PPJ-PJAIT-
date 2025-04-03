package ppj9.Task2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input your string");
        String word = scanner.nextLine();

        System.out.println("inpiut letter to be found");
        char letter = scanner.next().charAt(0);

        System.out.println(word.contains(String.valueOf(letter)));
    }
}
