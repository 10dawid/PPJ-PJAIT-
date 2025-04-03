package ppj17.Task3;

import java.sql.SQLOutput;

public class Task3 {
    static int sumElements (int [][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    static int sumElements (int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {2,2,2,2};
        int[][] b = {{2,2,2,2},{2,2,2,2}};
        System.out.println(sumElements(a));
        System.out.println(sumElements(b));
    }
}
