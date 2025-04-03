package ppj28.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "^[01]([01]{2})*$";
        Pattern pattern = Pattern.compile(regex);
        String[] test = {"1010", "0", "101", "10111", "1", "100"};
        for(String str : test){
            Matcher matcher = pattern.matcher(str);
            System.out.println(str + " -> " + matcher.matches());
        }
    }
}
