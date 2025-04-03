package ppj19.Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(18);
        Cylinder cylinder = new Cylinder(3, 6);

        Sphereln sphereSquare = new Sphereln(square);
        Sphereln sphereCylinder = new Sphereln(cylinder);

        System.out.println("sphereSquare = " + sphereSquare.getSphereRadius());

        System.out.println("sphereCylinder = " + sphereCylinder.getSphereRadius());
    }
}
