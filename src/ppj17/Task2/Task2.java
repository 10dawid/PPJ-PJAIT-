package ppj17.Task2;

public class Task2 {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty() || s.length() == 1) return true;
        else{
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
            }
            return true;
        }
    }
    public static boolean isPalindromeRecursive(String s) {
        if (s.isEmpty() || s.length() == 1) return true;
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindromeRecursive(s.substring(1, s.length() - 1));
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("kamilslimak ----> " + isPalindrome("kamilslimak"));
        System.out.println("   abcd     ----> " + isPalindrome("abcd"));
        System.out.println("-------------------------");
        System.out.println("kamilslimak ----> " + isPalindromeRecursive("kamilslimak"));
        System.out.println("   abcd     ----> " + isPalindromeRecursive("abcd"));
    }
}
