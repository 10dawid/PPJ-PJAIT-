package ppj17.Task5;

public class Task5 {
    static int[] eliminateDuplicates(int[] arr) {
        int[] copy = new int[arr.length];
        int index = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            boolean found = false;
            for(int j = 0; j < index; j++){
                if (arr[i] == copy[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                copy[index] = arr[i];
                index++;
            }
        }
        int [] result = new int[index];
        for(int j = 0; j < index; j++) {
            result[j] = copy[j];
        }
        return result;

    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,2,3,4,5,5,6,7,7,8,9};
        int [] result = eliminateDuplicates(arr);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

}
