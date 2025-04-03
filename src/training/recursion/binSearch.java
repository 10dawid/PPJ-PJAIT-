package training.recursion;

public class binSearch {
    public static int binarSer(int val, int[] array, int start, int end){
        while(start <= end){
            int mid = (start + end) / 2;

            if(array[mid] == val) return mid;
            else if (array[mid] > val) return binarSer(val, array, start, mid-1);
            else if (array[mid] < val) return binarSer(val, array, mid + 1, end);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarSer(1,array,0, array.length - 1));
    }
}
