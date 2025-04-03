package sort.merge;

import java.util.Arrays;

public class Mer {
    private static void mergeSort(int[] array) {
        if (array.length <= 1) return;

        int mid = array.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];

        int mainIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while(leftIndex < leftArray.length)
            leftArray[leftIndex++] = array[mainIndex++];
        while(rightIndex < rightArray.length)
            rightArray[rightIndex++] = array[mainIndex++];

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }
    private static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftIndex = 0;
        int rightIndex = 0;
        int mainIndex = 0;

        while(leftIndex < leftArray.length && rightIndex < rightArray.length){
            if (leftArray[leftIndex] < rightArray[rightIndex]) array[mainIndex++] = leftArray[leftIndex++];
            else array[mainIndex++] = rightArray[rightIndex++];
        }
        while(leftIndex < leftArray.length)
            array[mainIndex++] = leftArray[leftIndex++];
        while(rightIndex < rightArray.length)
            array[mainIndex++] = rightArray[rightIndex++];
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
