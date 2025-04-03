package ppj13.Task3;

public class Task3 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100);
        int[][] arr = new int[x][x];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        int [] result = new int[arr.length * 2];
        int index = 0;

        for(int i = 0; i < arr.length; i++) {//columns
            int min = arr[0][i];
            int max = arr[0][i];
            for(int j = 0; j < arr.length; j++) {//rows
                System.out.print(arr[j][i] + " ");
                if (arr[j][i] > max) max = arr[j][i];
                if (arr[j][i] < min) min = arr[j][i];
            }
            result[index++] = max;
            result[index++] = min;
            System.out.print(" max: " + max + " "+"min: "+min );
            System.out.println();
        }

        System.out.println("#############");

        for(int value: result) System.out.print(value + " ");



    }
}
