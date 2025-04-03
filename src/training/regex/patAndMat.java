package training.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patAndMat {
    public static void main(String[] args) {
        {
            Pattern p = Pattern.compile("^v1\\.\\d\\.\\D$");
            Matcher m = p.matcher("v1.4.a");
            System.out.println(m.matches());
        }
        System.out.println();
        {
            Pattern p = Pattern.compile("(?m)hello$");
            Matcher m = p.matcher("hello\ngeeks");
//            Matcher m = p.matcher("hello");
            System.out.println(m.matches());
        }
        System.out.println();
    }
}
