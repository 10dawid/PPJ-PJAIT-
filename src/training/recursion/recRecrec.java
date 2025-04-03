package training.recursion;

public class recRecrec {
    public static void R(int x){
        if (x <= 0) return;
        else{
            System.out.print(" " + x--);
            R(x);
            System.out.print(" " + x);
            R(--x);
        }
    }

    public static void main(String[] args) {
        R(4);
    }
}
