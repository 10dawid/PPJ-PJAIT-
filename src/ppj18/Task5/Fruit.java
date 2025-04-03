package ppj18.Task5;

public class Fruit {
    static String name;
    static double weight = (double) Math.random()*10;

    static void show(){
        System.out.println("Fruit: " + name +"\t\t weight: "+ weight);
    }
}
