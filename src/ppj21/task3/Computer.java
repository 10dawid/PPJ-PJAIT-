package ppj21.task3;

public class Computer extends Calculator{

    Computer(String deviceName) {
        super(deviceName);
    }

    @Override
    public String calculate(double x, double y){
        return super.calculate(x,y) + " " + (x * y) + " " + (x / y);
    }
}
