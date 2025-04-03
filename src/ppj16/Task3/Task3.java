package ppj16.Task3;

public class Task3 {
    static void printArray(int[] arr, int from){
        System.out.print(arr[from]+" ");
        if (from == arr.length - 1) ;
        else printArray(arr, from+1);
    }
    static void printReverseArray(int[] arr, int from){
        System.out.print(arr[arr.length-1-from]+" ");
        if (from == arr.length - 1) ;
        else printReverseArray(arr, from + 1);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("normal array: ");
        printArray(arr, 0);
        System.out.println();
        System.out.print("reversed array: ");
        printReverseArray(arr, 0);
    }
}
