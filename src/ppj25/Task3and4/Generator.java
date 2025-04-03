package ppj25.Task3and4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Generator {
    public static int[] generateSortedArray(){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10001);
        }
        mergeSort(array);
        return array;
    }
    public static void mergeSort(int[] array){
        if (array.length <= 1) return;
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for (int i = 0; i < array.length; i++) {
            if(i < mid){
                left[i] = array[i];
            }
            else right[i - mid] = array[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }
    public static void merge(int[] array, int[] left, int[] right){
        int index = 0, lIndex = 0, rIndex = 0;
        while(lIndex < left.length && rIndex < right.length){
            if (left[lIndex] < right[rIndex]) array[index++] = left[lIndex++];
            else array[index++] = right[rIndex++];
        }
        while(lIndex < left.length)
            array[index++] = left[lIndex++];
        while(rIndex < right.length)
            array[index++] = right[rIndex++];
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many files do you want?");
        int fileCount = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= fileCount; i++) {
            String fileName = "src//ppj25//Task3and4//inputData"+i+".txt";
            File file = new File(fileName);
            try {
                if (file.createNewFile()){
                    System.out.println("file number "+ i + " created");
                    FileWriter writer = new FileWriter(file);
                    int[] array = generateSortedArray();
                    for (int j = 0; j < array.length; j++) {
                        writer.write(array[j] + " ");
                    }
                    writer.close();
                }
                else System.out.println("file number " + i + " already exists");
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
