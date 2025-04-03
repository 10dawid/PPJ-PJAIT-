package ppj12.Task8;

public class Task8 {
    public static void main(String[] args) {
        float [][] array = new float[8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                array[i][j] = (float)Math.random();
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        float left = 0;
        float right = 0;
        int indexR = 7;
        for(int i = 0; i < 8; i++){
            left += array[i][i];
            right += array[i][indexR];
            indexR--;
        }
        System.out.println(left + " " + right);
    }
}
