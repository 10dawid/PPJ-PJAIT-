package ppj13.Task2;

public class Task2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        for(int[] i: arr){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("\n################\n");


        for(int row = 0; row < arr.length; row++){
            for (int i = 0; i < arr[row].length; i++) {//insertion sort
                int maxIndex = 0;
                for (int j = 0; j < arr[row].length - i; j++) {
                    if (arr[row][j] > arr[row][maxIndex]) maxIndex = j;
                }
                int temp = arr[row][arr[row].length - i - 1];
                arr[row][arr[row].length - i - 1] = arr[row][maxIndex];
                arr[row][maxIndex] = temp;
            }
        }



        for(int[] i: arr){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
