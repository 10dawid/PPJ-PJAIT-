package ppj19.Task4;

public class SphereOn {
    private double sphereRadius;

    SphereOn(Cylinder cylinder) {
        double heightPow = cylinder.getCylinderHeight() * cylinder.getCylinderHeight();
        double diameter = cylinder.getCylinderRadius() * 2;

        sphereRadius = Math.sqrt(Math.pow(diameter, 2) + heightPow);
    }
    SphereOn(Square square) {
        sphereRadius = Math.cbrt(3.0) * square.getSide();
    }

    public double getSphereRadius(){ return sphereRadius; }
}
