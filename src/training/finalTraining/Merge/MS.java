package training.finalTraining.Merge;
import java.util.Arrays;
public class MS {
    public static void mergeSort(int[] array){
        if (array.length <= 1) return;

        int mid = array.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];


        int mainIndex = 0;

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[mainIndex++];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[mainIndex++];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(leftArray, rightArray, array);
    }
    public static void merge(int[] leftArray, int[] rightArray, int[] array){
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
        int[] arr = {2,265,7,3,8,1,94,64,23,72,8,2,463,132,734,23,83};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

