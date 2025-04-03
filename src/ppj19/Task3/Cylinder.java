package ppj19.Task3;

public class Cylinder {
    private double cylinderRadius;
    private double cylinderHeight;
    Cylinder(double cylinderRadius, double cylinderHeight) {
        this.cylinderRadius = cylinderRadius;
        this.cylinderHeight = cylinderHeight;
    }
    public double baseArea(){
        return cylinderRadius*cylinderHeight*Math.PI;
    }
    public double cylinderVolume(){
        return baseArea() * cylinderHeight;
    }
    public double getCylinderRadius() { return cylinderRadius; }
    public double getCylinderHeight() { return cylinderHeight; }

    public void printData(){
        System.out.println("Cylinder Radius: " + cylinderRadius);
        System.out.println("Cylinder Height: " + cylinderHeight);
        System.out.println("baseArea() = " + baseArea());
        System.out.println("cylinderVolume() = " + cylinderVolume());
    }
}
