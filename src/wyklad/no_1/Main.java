package wyklad.no_1;

public class Main {
    public static void main(String[] args) {

        String text = "aabcdeeda";

        student [] data = new student[5];

        for (int i = 0; i < text.length(); i++) {
            for(int j = 0; j < data.length; j++) {
                if (data[j].letter == text.charAt(i)) {
                    data[j].occur += 1;
                }
                else{
                    data[j].occur = 1;
                    data[j].letter = text.charAt(i);
                }
            }
        }
    }
}
