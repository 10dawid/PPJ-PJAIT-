package training.recursion;
public class StringReverser {
    public static String reverseString(String text){
        if (text.length() <= 1) return text;
        else{
            char elem = text.charAt(text.length() - 1);
            String newText = "";
            for (int i = 0; i < text.length() - 1; i++) {
                newText += text.charAt(i);
            }
            return elem + reverseString(newText);
        }
    }

    public static void main(String[] args) {
        String one = "abc";
        String two = "George";
        String three = "a";

        System.out.println(reverseString(one));
        System.out.println(reverseString(two));
        System.out.println(reverseString(three));

    }
}
