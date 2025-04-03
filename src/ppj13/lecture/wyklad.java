package ppj13.lecture;

public class wyklad {
    public static void main(String[] args) {
        System.out.println(sumDigit(123));
    }
    private static int sumDigit(int n){
        int sum = 0;
        int temp = n;
        while(temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}
