package wyklad.no_2.inheritance;

public class Dog extends Animal{

    Dog(String name){
        super(name);
    }
@Override
    public void eat(){
        System.out.println("Dog eats");
    }
}
