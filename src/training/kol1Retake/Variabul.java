package training.kol1Retake;
import java.lang.Integer;
public class Variabul {
    private static java.lang.Integer Integer;

    public static void main(String[] args) {
        int bin = 0b101;
        int dec = 5;
        int hex = 0x5;
        int oct = 05;
        long myLong = 12322222222222245L;
        System.out.println("bin = " + bin);
        System.out.println("oct = " + oct);
        System.out.println("hex = " + hex);
        System.out.println("dec = " + dec);
        System.out.println("myLong = " + myLong);

        int left = 0b101110101;
        int right = 0b101110101;

        left = left << 4;
        right = right >> 4;
        System.out.println("left = " + Integer.toBinaryString(left));
        System.out.println("right = " + Integer.toBinaryString(right));
        int i;
        for ( i = 0; i < 5; i++) {
        }
        System.out.println(i);

        System.out.println(i == 5 ? "yes" : "no");
    }
}
