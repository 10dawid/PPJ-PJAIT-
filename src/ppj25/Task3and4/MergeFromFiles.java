package ppj25.Task3and4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeFromFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many files to be checked and merged?");
        int filesCount = scanner.nextInt();
        scanner.close();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= filesCount; i++) {
            String fileName = "src//ppj25//Task3and4//inputData" + i + ".txt";
            try{
                FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr);
                String content = br.readLine();

                if (content != null){
                    String[] numbersAsStrings = content.trim().split("\\s+");
                    int[] arrayOfNumbers = Arrays.stream(numbersAsStrings).mapToInt(Integer::parseInt).toArray();
                    for (int num : arrayOfNumbers)
                        numbers.add(num);
                }
                br.close();
                fr.close();
                System.out.println("content form file number " + i + " was saved");
            } catch (FileNotFoundException e) {
                System.out.println("file number "+ i + " was not found");
            } catch (IOException e) {
                System.out.println("sth went wrong with file number " + i );
            }
        }
        int[] finalArray = numbers.stream().mapToInt(Integer::intValue).toArray();
        Generator.mergeSort(finalArray);
        try{
            FileWriter fw = new FileWriter("src//ppj25//Task3and4//mergedNumbers.txt");
            for (int i = 0; i < finalArray.length; i++) {
                fw.write(finalArray[i] + "\n");
            }
            fw.close();
            System.out.println("result saved to a file successfully");
        } catch (IOException e) {
            System.out.println("sth went wrong when writing the result into a text file");
        }
    }
}
