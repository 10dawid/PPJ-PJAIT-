package ppj12.Task7;

public class Task7 {
    public static void main(String[] args) {
        int m = (int) (Math.random() * 10);
        int n = (int) (Math.random() * 10);
        int o = (int) (Math.random() * 10);

        int [] tabM = new int[m];
        int [] tabN = new int[n];
        int [] tabO = new int[o];


        for (int i = 0; i < m; i++) {
            tabM[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < n; i++) {
            tabN[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < o; i++) {
            tabO[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < m; i++) {
            System.out.print(tabM[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(tabN[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < o; i++) {
            System.out.print(tabO[i] + " ");
        }

        System.out.println("\n");


        int arrays[][] = {tabM,tabN,tabO};

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }
}
