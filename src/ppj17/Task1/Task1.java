package ppj17.Task1;

public class Task1 {
    public static double CelsiusFahrenheit(double degrees, char base){
        if (base == 'c' || base == 'C'){
            double fahrenheit = degrees * 1.8 + 32;
            return fahrenheit;
        }
        if (base == 'f' || base == 'F'){
            double celsius = (degrees - 32) * 1.8;
            return celsius;
        }
        return 404;
    }

    public static void main(String[] args) {
        double a = -50; //Celsius
        System.out.println(a + " <--- Celsius   Fahrenheit ---> " + CelsiusFahrenheit(a, 'c'));
    }
}
