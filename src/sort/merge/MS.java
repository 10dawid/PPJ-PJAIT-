package sort.merge;
import java.util.Arrays;
public class MS {
    public static void mergeS(int[] array){
        if (array.length <= 1) return;

        int mid = array.length / 2;

        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        int leftIndex = 0;
        int rightIndex= 0;

        for (int i = 0; i < array.length; i++) {
            if (i < mid) left[leftIndex++] = array[i];
            else right[rightIndex++] = array[i];
        }

        mergeS(left);
        mergeS(right);
        merge(left, right, array);
    }
    public static void merge(int[] left, int[] right, int[]array){
        int leftIndex = 0;
        int rightIndex = 0;
        int mainIndex = 0;

        while(leftIndex < left.length && rightIndex < right.length){
            if(left[leftIndex] < right[rightIndex])
                array[mainIndex++] = left[leftIndex++];
            else array[mainIndex++] = right[rightIndex++];
        }
        while(leftIndex < left.length) array[mainIndex++] = left[leftIndex++];
        while(rightIndex < right.length) array[mainIndex++] = right[rightIndex++];
    }

    public static void main(String[] args) {
        int[] array = {2,5,1,6,8,4,7};
        mergeS(array);
        System.out.println(Arrays.toString(array));
    }
}

