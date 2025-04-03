package training.recursion;

public class Rec {
    public static int function(int n ){
        if (n == 1) return 1;
        else if (n == 2) return 2;
        return function(n - 1) * function(n - 2);
    }

    public static int funkcja(int n) {
        if (n < 2) return 1;
        if (n % 2 == 0)
            return funkcja(n - 2) * funkcja(n - 1);
        return funkcja(n - 1) + 8;
    }
    public static void C(int x, int y){
        if(y > 0){
            C(x + 2, y - 1);
            System.out.print(x + " ");
            C(x + 4, y - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(function(6));
        System.out.println(funkcja(4));
        System.out.println(funkcja(7));

        C(3,4);
    }
}
