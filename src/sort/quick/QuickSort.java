package sort.quick;
import java.util.Arrays;
public class QuickSort {
    public static void quickSort(int[] array, int start, int end){
        if (end <= start) return;

        int pivot =  partition(array, start,end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    public static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start - 1;
        for(int j = start; j <= end; j++){
            if(array[j] < pivot){
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
        int[] array = {4,2,8,1,6,12,7,9,1,5,8,1,3,8};
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
