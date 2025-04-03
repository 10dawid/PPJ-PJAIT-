package ppj10.Task1;

public class Task1 {
    public static void main(String[] args) {
        int a = 23, r = 121, g = 255, b = 130, color = 0;
        color = (a << 24) + (r << 16) + (g << 8) + b;
        System.out.println("a, r, g, b = " + a + ", " + r + ", " + g + ", " + b);
        System.out.println("color = " + color);
        a = r = g = b = 0;

        a = color >> 24;
//        r = (color >> 16) - (a << 8);
        r = (color >> 16) & 0xff;
//        g = (color >> 8) - (a << 16) - (r << 8);
        g = (color >> 8) & 0xff;
//        b = color - (a << 24) - (r << 16) - (g << 8) ;
        b = (color) & 0xff;
        System.out.println("a, r, g, b = " + a + ", " + r + ", " + g + ", " + b);

    }
}
