package ppj17.Task7;

public class Task7 {
    public static int[] generateArray(int size, int max){
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = (int)(Math.random() * max);
        }
        return array;
    }
}
