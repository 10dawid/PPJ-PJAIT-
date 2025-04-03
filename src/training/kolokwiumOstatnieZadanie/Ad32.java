package training.kolokwiumOstatnieZadanie;

public class Ad32 {
    public static boolean antyPrzekatnaSym(int[][] array){
        //od prawego gornego do lewego dolnego
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] != array[n - j - 1][n - i - 1]) {
                    return false;
                }
            }
        }

        return true;
        
    }
    public static void main(String[] args){


        int[][] my2dArray = {{1,8,2,3,5},
                             {3,5,1,2,3},
                             {2,5,1,1,2},
                             {6,2,5,5,8},
                             {4,6,2,3,1}};
        System.out.println(antyPrzekatnaSym(my2dArray));
    }
}
