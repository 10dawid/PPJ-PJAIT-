package ppj28.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "^0x[0-9A-F]*$";
        Pattern pattern = Pattern.compile(regex);
        String[] test = {"0x1234567890ABCDEF", "0xA66", "G31", "0xFFF", "0x122"};

        for (String str : test){
            Matcher matcher = pattern.matcher(str);
            System.out.println(str + " -> " + matcher.matches());
        }
    }
}
