package ppj22.Task3;

public class Reverser extends Changer{

    @Override
    public void change(int[] array){
        int tempArr[] = new int[array.length];
        for(int i = 0; i < array.length; i++){
            tempArr[i] = array[i];
        }
        int index = 0;
        for(int i = array.length - 1; i >= 0; i--){
            array[index] = tempArr[i];
            index++;
        }
    }
}
