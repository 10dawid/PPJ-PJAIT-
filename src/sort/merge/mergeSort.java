package sort.merge;

public class mergeSort {

    public static void mergeSort(int[] array){
        int length = array.length;
        if (length <= 1) return;
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int left = 0;
        int right = 0;

        for (int i = 0; i < length; i++) {
            if (i < middle){
                leftArray[left++] = array[i];
            }
            else rightArray[right++] = array[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }
    public static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftIndex = 0;
        int rightIndex = 0;


        for(int i = 0; i < array.length; i++){
            if (leftIndex < leftArray.length && rightIndex < rightArray.length){
                if(leftArray[leftIndex] < rightArray[rightIndex])
                    array[i] = leftArray[leftIndex++];
                else
                    array[i] = rightArray[rightIndex++];
            } else if (leftIndex < leftArray.length)
                array[i] = leftArray[leftIndex++];
            else array[i] = rightArray[rightIndex++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,6,4,3,2,7,7,1};
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "; ");
        }
    }

}
