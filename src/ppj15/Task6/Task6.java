package ppj15.Task6;

public class Task6 {
    public static void main(String[] args) {
        int[] values = {3,5,15};
        String[] results = {"Fizz","Buzz","FizzBuzz"};
        fizzBuzz(50,values,results);

    }
    public static void fizzBuzz(int n, int[] values, String[] results) {
        for(int i = 1; i <= n; i++){
            boolean isFizz = false;
            for(int j = values.length - 1; j >= 0; j--){
                if (i % values[j] == 0){
                    System.out.println(results[j]);
                    isFizz = true;
                    break;
                }
            }
            if(!isFizz) System.out.println(i);
        }

    }
}
