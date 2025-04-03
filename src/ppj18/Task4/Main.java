package ppj18.Task4;

public class Main {
    public static void main(String[] args) {
        People one = new People();
        String friend = "Muhamad";
        one.name = "Jamal";

        People.Staticgreeting(friend);
        one.nonStaticGreeting(friend);

    }
}
