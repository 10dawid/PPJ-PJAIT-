package training.kolokwiumProbne;

public class Main {
    public static void main(String[] args) {
        {
            Fun.printNumbers(3, 10);
        }
        System.out.println();
        System.out.println("<><><><>");
        {
            int[][] array = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            Fun.funArray2D(array);
        }
        System.out.println("<><><><>");
        {
            Fun.elementFun(5);
            Fun.elementFun(2.5);
            Fun.elementFun('&');
        }
        System.out.println("<><><><>");
        {
            Fun.triangleA(5);
        }
        System.out.println("<><><><>");
        {
            B objB = new B(5);
            System.out.println("----");
            C objC = new C(6,9);
        }
        System.out.println("<><><><>");
        {
            C objC = new C(4,'&', 2);
            objC.fun();
        }
        System.out.println("<><><><>");

    }
}
