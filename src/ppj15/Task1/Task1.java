package ppj15.Task1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        printArray(a);
        int [][] b = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
        };
        System.out.println();
        printArray(b);
    }
    public static void printArray(int[] a){
        System.out.print("[");
        for (int i = 0; i < a.length; i++){
            if (i == a.length - 1) System.out.print(a[i]+"]");
            else System.out.print(a[i] + ", ");
        }
    }
    public static void printArray(int[][] a){
        for(int j = 0; j < a.length; j++){
            System.out.print("[");
            for (int i = 0; i < a[j].length; i++){
                if (i == a[j].length - 1) System.out.print(a[j][i]+"]");
                else System.out.print(a[j][i] + ", ");
            }
            System.out.println();
        }
    }
}