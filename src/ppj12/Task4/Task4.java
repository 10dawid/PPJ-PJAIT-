package ppj12.Task4;

public class Task4 {
    public static void main(String[] args) {
        int [] a = {1,3,5,7,9,14};
        int [] b = {10,8,6,4,2,1};
        int [] c = new int[(a.length+b.length)];
        int indexA = 0;
        int indexB = b.length-1;
        int indexC = 0;

        while(indexA < a.length && indexB >= 0) {
            if(a[indexA] <= b[indexB]) c[indexC++] = a[indexA++];
            else c[indexC++] = b[indexB--];
        }

        while (indexA < a.length) c[indexC++] = a[indexA++];
        while (indexB >= 0) c[indexC++] = b[indexB--];



        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

    }
}
