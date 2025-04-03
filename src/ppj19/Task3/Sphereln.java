package ppj19.Task3;

public class Sphereln {
    private double SphereRadius;

    Sphereln(Cylinder cylinder){
        if (cylinder.getCylinderHeight() / 2 == cylinder.getCylinderRadius()){
            SphereRadius = cylinder.getCylinderHeight() / 2;
        }
        else SphereRadius = 0;
    }

    Sphereln(Square square) {
        SphereRadius = square.getSide() / 2;
    }
    public double getSphereRadius() { return SphereRadius; }

    public void getData(Cylinder cylinder, Square square){
        System.out.println("SphereRadius: " + SphereRadius);
        cylinder.printData();
        square.volume();
        square.area();
    }
}
