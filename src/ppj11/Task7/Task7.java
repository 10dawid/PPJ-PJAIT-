package ppj11.Task7;

public class Task7 {
    public static void main(String[] args) {
        int n = 4;
        int size = n * 2 - 1;

        for (int i = 0; i < size; i ++){ //rows
            for(int j = 0; j < size; j++){ //columns
                if (i % 2 != 0) System.out.print("O ");
                else {
                    if (j % 2 != 0) System.out.print("O ");
                    else System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
