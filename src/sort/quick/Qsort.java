package sort.quick;

import java.util.Arrays;

public class Qsort {
    public static void quickSrt(int[] array, int start, int end){
        if (end <= start) return;
        int pivot = partition(array, start, end);
        quickSrt(array, start, pivot -1);
        quickSrt(array, pivot + 1, end);
    }
    private static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end; j++){
            if (array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }


    public static void main(String[] args) {
        int[] array = {9,0,1,2,7,3,8,1,2,3,4};
        quickSrt(array, 0, array.length -1);
        System.out.println(Arrays.toString(array));
    }
}
