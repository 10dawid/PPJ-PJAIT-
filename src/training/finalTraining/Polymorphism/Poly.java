package training.finalTraining.Polymorphism;

public class Poly {
    private String name;
    private int number;

    public Poly(String name, int number){
        this.name = name;
        this.number = number;
    }


    public String getName(){ return this.name; }
    public int getNumber(){ return this.number; }


    @Override
    public String toString(){
        return this.name + " " + this.number;
    }
}
