package ppj18.Task3;

public class Task3 {
    public static void main(String[] args) {
       StringAndChar abc = new StringAndChar();
       abc = doAction(65);
       System.out.println(abc.myChar);
        System.out.println(abc.myString);
    }
    public static StringAndChar doAction(int n){
        StringAndChar sa = new StringAndChar();
        sa.myChar = (char) n;
        sa.myString = Integer.toBinaryString(n);
        return sa;
    }

}
