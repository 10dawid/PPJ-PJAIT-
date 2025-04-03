package ppj19.Task4;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(15);
        SphereOn squareon = new SphereOn(square);
        System.out.println("squareon.getSphereRadius() = " + squareon.getSphereRadius());
        System.out.println("---------------------------");
        Cylinder cylinder = new Cylinder(1.5,4);
        SphereOn cylinderon = new SphereOn(cylinder);
        System.out.println("cylinderon.getSphereRadius() = " + cylinderon.getSphereRadius());
    }
}
