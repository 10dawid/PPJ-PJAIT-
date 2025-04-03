package ppj16.Task1;

public class Task1 {
    static int countEven(int[] arr, int from){
        int index = from;
        while(index < arr.length){
            if(arr[index] % 2 == 0){
                return 1 + countEven(arr, index + 1);
            }
            else return countEven(arr, index + 1);
        }
        return 0;
    }


    static int countEvenIterative(int[] arr, int from){
        int sum = 0;
        for(int i = from; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                sum++;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] a = {2,3,2,4,3,1,6,3,2,3};
        System.out.println("# of even: " + countEven(a, 0)+ " using recursion");
        System.out.println("# of even: " + countEvenIterative(a, 0)+ " using iteration");

    }
}
