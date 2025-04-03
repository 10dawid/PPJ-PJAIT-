package ppj11.Task4;

public class Task4 {
    public static void main(String[] args) {

        int [] array = new int[10];
        int k = 2;
        int [] movedArray = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }


        int [] overFlow = new int[k];
        int x = 0;
        for(int i = array.length - k; i < array.length; i++){
            overFlow[x] = array[i];
            x++;
        }


//        System.arraycopy(array, k - k, movedArray, k, array.length - k);
//        System.arraycopy(overFlow, 0, movedArray, 0, overFlow.length);


        for(int i = 0; i < array.length; i++){
            System.out.print(movedArray[i] + " ");
        }
        System.out.println();

    }
}
