package ppj15.Task4;

public class Task4 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{1,9},{3,1,8}};
        int [] result = evenOdd(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] evenOdd(int[][] arr) {
        int[] sumArr = {0,0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) sumArr[0] += 1;
                else sumArr[1] += 1;
            }
        }
        return sumArr;
    }
}
