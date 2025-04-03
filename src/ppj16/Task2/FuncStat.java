package ppj16.Task2;

public class FuncStat {
    public static int fiboR(int n){
        if(n == 1) return n;
        else if (n == 0) return 0;
        else return fiboR(n-1) + fiboR(n-2);
    }

    public static int fibol(int n){
        if (n == 0 || n == 1) return n;
        int numMinusTwo = 0;
        int numMinusOne = 1;
        int actual = 0;
        for(int i = 2; i <= n; i++){
            actual = numMinusTwo + numMinusOne;
            numMinusTwo = numMinusOne;
            numMinusOne = actual;
        }
        return actual;
    }

    public static int gcdR(int a, int b){
        if (a == b) return a;
        else{
            if (a > b) return gcdR(a - b, b);
            else return gcdR(a, b - a);
        }
    }

    public static int gcdl(int a, int b){
        if (a == b) return a;
        int gcd = 1;
        for (int i = 1; i <= (a > b ? b : a); i++){
            if (a % i == 0 && b % i == 0) gcd = i;
        }
        return gcd;
    }

    public static int maxElem(int[] arr, int from){
        int max = arr[from];
        if (from == arr.length - 1) return max;
        else return (Math.max(max, maxElem(arr, from + 1)));
    }

    public static int numEven(int[] arr, int from){
        int index = from;
        while(index < arr.length){
            if(arr[index] % 2 == 0){
                return 1 + numEven(arr, index + 1);
            }
            else return numEven(arr, index + 1);
        }
        return 0;
    }

    public static void reverse(int[] arr, int from){
        int index = arr.length - 1 - from;
        System.out.print(arr[index] + ",");
        if (index > 0)  reverse(arr, from + 1);
    }

    public static boolean isPalindrom(String s){
        if (s.isEmpty()) return true;
        if (s.length() == 1) return true;
        if (s.charAt(0) != s.charAt(s.length()-1)) return false;
        return isPalindrom(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println("fiboR(int n) n = 10:  ---> "+ fiboR(10));
        System.out.println("~~~~~~~~~");
        System.out.println("fibol(int n) n = 10:  ---> "+ fibol(10));
        System.out.println();

        System.out.println("gcdR(int a, int b) a = 26, b = 13:  ---> "+ gcdR(26,13));
        System.out.println("~~~~~~~~~");
        System.out.println("gcdl(int a, int b) a = 26, b = 13:  ---> "+ gcdl(26,13));
        System.out.println();

        int[] a = {9,4,3,2,5,6,7,1,2};
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+",");
        }
        System.out.println();
        System.out.println("maxElem(a, 1) = " + maxElem(a, 1));
        System.out.println("numEven(a, 0) = " + numEven(a, 0));
        System.out.print("reverse(arr, 0) ----> ");
        reverse(a, 0);
        System.out.println();
        String b = "kajak";
        System.out.println("isPalindrom(kamilslimak) ----> " + isPalindrom(b));


    }
}
