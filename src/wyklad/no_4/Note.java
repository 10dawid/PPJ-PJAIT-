package wyklad.no_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// StringBuilder
// Matcher
// Pattern

public class Note {
    public static void main(String[] args) {
        String str = "abc";

        long timeStart = System.nanoTime();
//
//        for (int i = 0; i < 1000; i++) {
//            str += "a";
//        }
//
        long timeEnd = System.nanoTime();
//
//        System.out.println("time used for 1000 iterations in for loop: " + (timeEnd - timeStart));


        str = "abc";
        timeStart = System.nanoTime();
        for (long j = 1000; j < 10000000000L; j *= 10) {
            str += "a";
        }
        timeEnd = System.nanoTime();
        System.out.println("time elapsed using str+='a'  " + (timeEnd - timeStart));


        timeStart = System.nanoTime();
        StringBuilder sb = new StringBuilder("a");

        for (long j = 1000; j < 10000000000L; j *= 10) {
            sb.append("a");
        }

        timeEnd = System.nanoTime();
        System.out.println("time elapsed using StringBuilder  " + (timeEnd - timeStart));



        str = "aaabbbccccaaa";
        {
            Pattern pattern = Pattern.compile("[abc]*"); //wzorzec elementow do naszego ciagu
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {//zwroci wartosc logiczna;;; tak dlugo jak bede znajdowal elementy ciagu ktore skladaja sie z samych liter a bede wyswietlal na ekranie matcher group
                System.out.println(matcher.group());

            }
            System.out.println(matcher.matches());
        }

        System.out.println("\n][][][][][][][][][\n");
        {
            str = "9-1-2025";   //true
//            Pattern pattern = Pattern.compile("[0-3]\\d-1-2025");
            Pattern pattern = Pattern.compile(
              "(([1-9])|([12]\\d)|([3][01]))-1-2025"
            );
            Matcher matcher = pattern.matcher(str);
            System.out.println(matcher.matches());
        }

    }
}