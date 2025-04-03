package sort.merge;

import java.util.Arrays;

public class merge {
    public static void mergeSort(int[] array){
        if (array.length <= 1) return;
        int mid = array.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];

        for(int i = 0; i < array.length; i++){
            if(i < mid) leftArray[i] = array[i];
            else rightArray[i - mid] = array[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
//        System.out.println(Arrays.toString(array));
    }
    public static void merge(int[] leftArray, int[] rightArray, int[]array){
        int leftIndex = 0;
        int rightIndex = 0;
        int mainIndex= 0;
        while(leftIndex < leftArray.length && rightIndex < rightArray.length){
            if (leftArray[leftIndex] < rightArray[rightIndex])
                array[mainIndex++] = leftArray[leftIndex++];
            else
                array[mainIndex++] = rightArray[rightIndex++];
        }
        while(leftIndex < leftArray.length)
            array[mainIndex++] = leftArray[leftIndex++];
        while(rightIndex < rightArray.length)
            array[mainIndex++] = rightArray[rightIndex++];
    }

    public static void main(String[] args) {
        int[] arr = {9,7,8,4,6,5,2,3,1,0};
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
