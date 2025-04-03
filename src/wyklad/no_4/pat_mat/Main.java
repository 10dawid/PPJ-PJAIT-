package wyklad.no_4.pat_mat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        {
            Pattern pattern = Pattern.compile("[A-Z].[fk]e");
            Matcher matcher = pattern.matcher("Like");
            boolean matches = matcher.matches();
            System.out.println(matches);
        }
        System.out.println("<><><><><><>");
        {
            Pattern pattern = Pattern.compile("[A-Z][a-z]");
            Matcher matcher = pattern.matcher("GeEkIfic");
            for (int i = 0; i < 5; i++) {
                boolean match = matcher.find();
                System.out.println(match);
            }
        }
    }
}
