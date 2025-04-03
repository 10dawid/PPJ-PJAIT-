package training.kolokwiumProbne;

class Fun{
    public static void printNumbers(int start, int n) {
        if (start > n) {
            return;
        }
        printNumbers(start + 3, n);
        System.out.print(start + ", ");
    }
    public static void funArray2D(int[][] array) {
        int numberOfRows = array.length;
        int numberOfColumns = array[0].length;
        for (int j = 0; j < numberOfColumns; j++) {
            System.out.print((j + 1) + " ");
            System.out.print(array[0][j] + " ");
            System.out.print(array[numberOfRows - 1][j] + " ");
            System.out.println();
        }
    }
    public static void elementFun(byte a){
        System.out.println("3");
    }
    public static void elementFun(int a){
        System.out.println("1");
    }
    public static void elementFun(double a){
        System.out.println("2");
    }
    public static void triangleA(int a){
        if (a < 4 || a > 7)
            return;
        triangleC(a--);
        triangleB(--a);
    }
    public static void triangleB(int a){
        if (a < 4 || a > 7)
            return;
        System.out.println(a);
        triangleC(--a);
    }
    public static void triangleC(int a){
        if (a < 4 || a > 7)
            return;
        triangleC(++a);
        System.out.println(a);
    }
}


