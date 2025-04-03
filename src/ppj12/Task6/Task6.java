package ppj12.Task6;

public class Task6 {
    public static void main(String[] args) {
        int n = 10;
        int valueIndex = 0;
        int [] array = new int[n];
        int [] values = new int[n];
        int [] counter = new int[n];


        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
            boolean found = false;
            for (int j = 0; j < valueIndex; j++) {
                if (array[i] == values[j]) {
                    found = true;
                    counter[j]++;
                }
            }
            if (!found) {
                values[valueIndex] = array[i];
                counter[valueIndex++]++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < valueIndex; i++) {
            System.out.print(counter[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < valueIndex; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();

    }
}
