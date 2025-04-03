package ppj25.Task2;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder liczby = new StringBuilder();
        int bajt;
        try{
            FileInputStream fis = new FileInputStream("src/ppj25/Task2/zad1.txt");
            while((bajt = fis.read()) != -1){
                liczby.append((char)bajt);
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        };
        System.out.println(liczby.toString());
        String[] liczbyJakoTekst = liczby.toString().split("\\s+");
        int suma = 0;
        for(String liczbaTekstowa : liczbyJakoTekst){
            suma += Integer.parseInt(liczbaTekstowa);
        }
        System.out.println(suma);
    }
}
