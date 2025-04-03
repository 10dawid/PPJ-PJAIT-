package ppj13.Task5;

public class Task5 {
    public static void main(String[] args) {
        String expected = "1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10";
        int tab[][] = {
                { 1, 2, 3, 4},
                { 5, 6, 7, 8},
                { 9,10,11,12},
                {13,14,15,16}
        };

        System.out.println(expected);
        int top = 0;
        int bot = tab.length-1;
        int left = 0;
        int right = tab[0].length-1;
        while (left <= right && top <= bot) {
            for(int i = left; i <= right; i++) {
                System.out.print(tab[top][i] + " ");
            }
            top++;
            for(int i = top; i <= bot; i++) {
                System.out.print(tab[i][right] + " ");
            }
            right--;
            for(int i = right; i >= left; i--) {
                System.out.print(tab[bot][i] + " ");
            }
            bot--;
            for(int i = bot; i >= top; i--) {
                System.out.print(tab[i][left] + " ");
            }
            left++;
        }
    }
}
