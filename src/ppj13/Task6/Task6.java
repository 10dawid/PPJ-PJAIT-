package ppj13.Task6;

public class Task6 {
    public static void main(String[] args) {
        int [][] tab = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {1, 2, 3}
        };
        int [][] rotated = new int[tab[0].length][tab.length];


        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                rotated[j][tab.length-1-i] = tab[i][j];
            }
        }


        for(int i = 0; i < rotated.length; i++){
            for(int j = 0; j < rotated[i].length; j++){
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}
