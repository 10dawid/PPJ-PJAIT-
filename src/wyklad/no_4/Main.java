import java.util.regex.Matcher;
import java.util.regex.Pattern;

public
    class Main {

    public static void main(String[] args) {
        {
            String str = "Hello";
            str = new String("Hello Ala");
            System.out.println(str);
        }
//        for(int j = 1000; j < 100000000; j*=10){
//            String str = "a";
//
//            long timeStart = System.nanoTime();
//
//            for(int i = 0; i < j; i++)
//                str += "a";
//
//            long timeEnd = System.nanoTime();
//
//            System.out.println( j + ": " + (timeEnd-timeStart));
//        }
        for(long j = 1000; j < 1000000000L; j*=10){
            StringBuilder sb = new StringBuilder("a");

            long timeStart = System.nanoTime();

            for(int i = 0; i < j; i++)
                sb.append("a");

            long timeEnd = System.nanoTime();

            System.out.println( j + ": " + (timeEnd-timeStart));

            String str = sb.toString();
        }

        {
            String str = "aaabaaaaaaaacaaaaad";

//            String str = "abccbabca";
            Pattern pattern = Pattern.compile("a+");
            Matcher matcher = pattern.matcher(str);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }
        {
            String str = "abccbabca";

            Pattern pattern = Pattern.compile("[abc]+");
            Matcher matcher = pattern.matcher(str);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }
        {
            String str = "abccbdabca";

            Pattern pattern = Pattern.compile("[abc]+");
            Matcher matcher = pattern.matcher(str);
            System.out.println(matcher.matches());
        }
        {
            String str = "10-1-2025";

            Pattern pattern = Pattern.compile("[0123][0123456789]-1-2025");
            Matcher matcher = pattern.matcher(str);
            System.out.println(matcher.matches());
        }
        {
            String str = "10-1-2025";

            Pattern pattern = Pattern.compile("[0123][0-9]-1-2025");
            Matcher matcher = pattern.matcher(str);
            System.out.println(matcher.matches());
        }
        {
            String str = "10-1-2025";

            Pattern pattern = Pattern.compile("[0-3]\\d-1-2025");
            Matcher matcher = pattern.matcher(str);
            System.out.println(matcher.matches());
        }
        {
            String str = "31-1-2025";

            Pattern pattern = Pattern.compile(
                "(([1-9])|([12]\\d)|(3[01]))-1-2025"
            );


            Matcher matcher = pattern.matcher(str);
            System.out.println(matcher.matches());
        }



    }
}
