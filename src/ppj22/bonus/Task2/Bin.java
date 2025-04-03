package ppj22.bonus.Task2;

public class Bin {
    public static int binSearchRec(int[] a, int what, int from, int to) {
        int newLen = to - from;
        int[] newArray = new int[newLen];
        int newArrayIndex = 0;
        for(int i = from; i < to; i++) {
            newArray[newArrayIndex++] = a[i];
        }
        return binSearch(a, what);
    }
    private static int binSearch(int[] a, int what) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == what) {
                return mid;
            }
            else if (a[mid] < what) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
