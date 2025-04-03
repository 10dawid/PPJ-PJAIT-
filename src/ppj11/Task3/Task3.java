package ppj11.Task3;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[25];

        int evenElements = 0;
        int oddElements = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (array[i] % 2 == 0) {
                evenElements++;                         // counting odd and even numbers
            } else oddElements++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");


        int[]  evenArray = new int[evenElements];
        int[] oddArray = new int[oddElements];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[evenIndex] = array[i];
                evenIndex++;
            }
            else {
                oddArray[oddIndex] = array[i];
                oddIndex++;
            }
        }

        for (int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }



    }
}

