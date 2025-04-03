package ppj11.Task9;

public class Task9 {
    public static void main(String[] args) {
        int n = 4;
        int size  = n * 2 - 1;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if (i == 0 || i == size - 1 || j == i || j == size - 1 - i) System.out.print("X ");
                else System.out.print("O ");
            }
            System.out.println();
        }
    }
}

