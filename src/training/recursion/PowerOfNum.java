package training.recursion;

public class PowerOfNum {
    public static int aToBthPower(int a, int b){
        if (b == 1) return a;
        else return a * aToBthPower(a, b -1);
    }


    public static void main(String[] args) {
        System.out.println(aToBthPower(2,10));
    }
}
