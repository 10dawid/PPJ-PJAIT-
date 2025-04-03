package ppj21.start;

public class Main {
    public static void main(String[] args) {
        
        Shape shapeOBJ = new Shape("Blue");
        System.out.println("shapeOBJ.getArea() = " + shapeOBJ.getArea());
        
        Square squareOBJ = new Square("Green", 5);
        System.out.println("squareOBJ.getArea() = " + squareOBJ.getArea());

        System.out.println(squareOBJ);

        Circle circleOBJ = new Circle("Red", 5);
        System.out.println(circleOBJ);

        Shape shapeButSquare = new Square("Red", 6);
        System.out.println(shapeButSquare.getArea());
        System.out.println("-------------------");
        Shape[] shapes = {shapeOBJ, squareOBJ,circleOBJ, shapeButSquare};
        for(Shape shape : shapes){
            System.out.println(shape);
            System.out.println(shape.getArea());
        }


        
    }
}
