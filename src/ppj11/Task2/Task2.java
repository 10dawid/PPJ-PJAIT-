package ppj11.Task2;

public class Task2 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }
        System.out.println(sum);
    }
}
