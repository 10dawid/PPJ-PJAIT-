package ppj19.Task1;

public class Square {
    private int side;

    Square(int side){
        this.side = side;
    }
    public void area(){
        System.out.println("area: " + side*side);
    }
    public void volume(){
        System.out.println("volume: " + side*side*side);
    }
}
