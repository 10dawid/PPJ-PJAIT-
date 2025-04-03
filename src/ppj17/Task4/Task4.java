package ppj17.Task4;

public class Task4 {
    static int[] arrConverter(int[][] arr){
        int n = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                n ++;
            }
        }
        int index = 0;
        int[] x = new int[n];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                x[index] = arr[i][j];
                index ++;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        int[][] arr = { {1,2,3},
                        {4,5,6},
                        {7,8,9},};
        int[] a = arrConverter(arr);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
