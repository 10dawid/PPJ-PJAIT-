package ppj12.Task2;

public class Task2 {
    public static void main(String[] args) {
        int n = 10;
        int [] intArray = new int[n];
        double [] doubleArray = new double[n];

        for (int i = 0; i < n; i++) {
            intArray[i] = (int) (Math.random() * 100);
            doubleArray[i] = Math.random() * 100;
        }

        System.out.println("before sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println();

        for(int i = 1; i < n; i++) {
            int tempInt = intArray[i];
            double tempDouble = doubleArray[i];
            int j = i - 1;
            double iSum = tempDouble + tempInt;
            while (j >= 0 && iSum < (doubleArray[j]+intArray[j])) {
                intArray[j+1] = intArray[j];
                doubleArray[j+1] = doubleArray[j];
                j--;
            }
            intArray[j+1] = tempInt;
            doubleArray[j+1] = tempDouble;
        }

        System.out.println("after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(doubleArray[i] + " ");
        }
    }
}
