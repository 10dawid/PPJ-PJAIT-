package ppj18.Task4;

public class People {
    static String name;
    public static void Staticgreeting(  String friend) {
        System.out.println(People.name + " staticly greets "+ friend);
    }
    public void nonStaticGreeting(String friend) {
        System.out.println(People.name + " non staticly greets "+ friend);
    }
}
