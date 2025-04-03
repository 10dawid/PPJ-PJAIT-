package ppj11.Task10;

//Stwórz program, który utworzy pięcioelementową tablicę i wypełni ją losowymi literami z zakresu od
//A do Z. Następnie wczytaj wartość do zmiennej typu char z klawiatury.
//Program będzie liczyć, ile razy znak wprowadzony z klawiatury pojawia się w tablicy, wyświetli liczbę
//wystąpień na ekranie i zastąpi każde wystąpienie wartością 0. Program powinien zakończyć działanie,
//gdy cała tablica zostanie wypełniona zerami.

import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[]  letters = new char[5];
        System.out.print("array: ");
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char)(Math.random() * 26 + 65);
        }
        boolean allZero = false;
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]+" ");
        }
        System.out.println();

        while(!allZero) {
            System.out.print("input char: ");
            char a = scanner.next().charAt(0);
            System.out.println("array: ");
            allZero = true;
            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == a) letters[i] = '0';
                System.out.print(letters[i] + " ");
                if (letters[i] != '0') allZero = false;
            }
            System.out.println();
        }


    }
}
