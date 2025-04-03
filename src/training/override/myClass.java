package training.override;

public class myClass {
    int x = 10;
    String text = "hello";

    @Override
    public String toString() {
        return "myClass{" +
                "x=" + x +
                ", text='" + text + '\'' +
                '}';
    }
}
