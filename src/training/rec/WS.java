package training.rec;

public class WS {
    public static int weirdSequence(int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return 2 * weirdSequence(n - 1);
        } else {
            return weirdSequence(n - 1) + 1;
        }
    }
    public static int mixedDecrementSum(int n) {
        if (n <= 0) {
            return 0;
        }
        return (n--) + mixedDecrementSum(--n);
    }
    public static int trickyRecursion(int n, int step) {
        if (n <= 0) {
            return step;
        }
        return trickyRecursion(--n, step + n--) + step;
    }
    static int counter = 0;

    public static void sideEffectRecursion(int n) {
        if (n <= 0) {
            return;
        }
        counter += n--;
        sideEffectRecursion(--n);
        counter += n; // Modyfikacja po powrocie z rekurencji
    }
    public static int symmetricRecursion(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + symmetricRecursion(--n) + symmetricRecursion(n--);
    }
    public static int alternateOperations(int n) {
        if (n <= 1) {
            return n;
        }
        if (n % 2 == 0) {
            return n + alternateOperations(--n);
        } else {
            return n * alternateOperations(n--);
        }
    }
    public static void shiftedIndexRecursion(int n, int index) {
        if (n <= 0) {
            System.out.println("Index: " + index);
            return;
        }
        System.out.println("Before: " + index);
        shiftedIndexRecursion(--n, index + n--);
        System.out.println("After: " + index);
    }




    public static void main(String[] args) {
//        // Przykład wywołania:
//        int result = weirdSequence(5);
//        System.out.println(result);
//        System.out.println(weirdSequence(7));
//        {
//            result = mixedDecrementSum(5);
//            System.out.println(result);
//        }
//        System.out.println(trickyRecursion(4, 1));
//        counter = 0;
//        sideEffectRecursion(5);
//        System.out.println(counter);
//        // Przykład wywołania:
//        result = symmetricRecursion(3);
//        System.out.println(result);
//        System.out.println(alternateOperations(5));
        shiftedIndexRecursion(3, 0);
    }

}
