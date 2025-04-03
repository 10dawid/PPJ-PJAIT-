package sort.quick;

import java.util.Arrays;

public class QS {
    public static void SzybkieSortowanie(int[] array, int start, int end){
        if(end <= start) return;

        int pivot = partition(array, start, end);
        SzybkieSortowanie(array, start, pivot - 1);
        SzybkieSortowanie(array, pivot + 1, end);
    }
    public static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j<= end; j++){
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
        int[] array = {5,7,1,2,8,3,7,2,3,2,6,12,51,12,72,32,12,73};
        SzybkieSortowanie(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
