package ppj18.Task6;

public class Balloon {
    static double helium = (double) ((Math.random() * (0.009 - 0.005)) + 0.005);
    public static double getLoad(double helium){
        double load = helium / (0.007/6) ;
        return load;
    }
}
