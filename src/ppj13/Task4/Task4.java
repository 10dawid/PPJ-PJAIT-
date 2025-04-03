package ppj13.Task4;

public class Task4 {
    public static void main(String[] args) {
        int [][] arr = {{1,0,3},
                        {0,2,2},
                        {3,2,0}};
        boolean sym = true;

        for(int i = arr.length - 1; i >= 0 && sym; i--) {
            for(int j = arr[i].length - 1; j >= 0; j--) {
                if (arr[i][j] != arr[j][i]) sym = false;
            }
        }
        System.out.println(sym);
        System.out.println(checkSym(arr));
    }
    public static boolean checkSym(int[][] arr){

        for(int i = arr.length - 1; i >= 0; i--) {
            for(int j = arr[i].length - 1; j >= 0; j--) {
                if (arr[i][j] != arr[j][i]) return false;
            }
        }
        return true;
    }

}
