package ppj22.Task3;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 3};
        Changer changer = new Changer();
        System.out.println(Arrays.toString(array));
        changer.change(array);
        System.out.println(Arrays.toString(array));
        changer = new Reverser();
        changer.change(array);
        System.out.println(Arrays.toString(array));
        changer = new Sorter();
        changer.change(array);
        System.out.println(Arrays.toString(array));
        changer = new Reverser();
        changer.change(array);
        System.out.println(Arrays.toString(array));
    }
}