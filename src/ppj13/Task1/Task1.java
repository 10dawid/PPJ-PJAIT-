package ppj13.Task1;

public class Task1 {
    public static void main(String[] args) {
        int m = (int) (Math.random() * 10);
        int n = (int) (Math.random() * 10);
        int [][] arr = new int[m][n];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int min = arr[0][0];
        int max = arr[0][0];

        for(int i = 1; i < arr.length; i++) {
            for(int j = 1; j < arr[i].length; j++) {
                if(arr[i][j] < min) min = arr[i][j];
                if(arr[i][j] > max) max = arr[i][j];
            }
        }


        System.out.println("arr: "+m+" x "+n);
        System.out.println("min = "+ min);
        System.out.println("max = "+ max);


    }
}
