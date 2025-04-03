package sort.quick;

import java.util.Arrays;

public class quickSortMain {
    public static void quickSort(int[] array, int start, int end){
        if(end <= start) return;
        int pivot = partition(array, start,end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot + 1, end);
    }

    public static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end; j++){
            if (array[j] < pivot) {
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
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        quickSort(arr, 0 , arr.length - 1);
        String str = Arrays.toString(arr);
        System.out.println(str);
    }
}
