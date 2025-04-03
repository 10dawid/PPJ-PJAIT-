package ppj21.task3;

public class CalculatingDevice {
    private String deviceName;

    CalculatingDevice(String deviceName) {
        this.deviceName = deviceName;
    }
    public String getDeviceName() {
        return deviceName;
    }

    @Override
    public String toString() {
        return deviceName;
    }

    public String calculate(double x, double y){
        return this + " " + ( x + y );
    }

    public static void printRes(CalculatingDevice[] a, double x, double y){
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i].calculate(x, y));
        }
    }
}
