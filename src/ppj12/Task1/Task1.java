package ppj12.Task1;

public class Task1 {
    public static void main(String[] args) {
        int [ ] arr = { 153 , 333 , 370 , 515 , 407 , 80};

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int n = 0;
            int sum = 0;
            while(x > 0){
                x /= 10;
                n++;
            }
            x = arr[i];
            while(x > 0){
                int number = x % 10;
                sum += (int)Math.pow(number, n);
                x /= 10;
            }

            if (arr[i] == sum) System.out.println("true " + arr[i]);
            else System.out.println("false "+ arr[i]);
        }
    }
}
