package training.kolokwiumOstatnieZadanie;

public class A {
    String strInA;
    double dbInA;

    public A(String strInA, double dbInA){
        this.dbInA = dbInA;
        this.strInA = strInA;
    }
    public void setA(String newText){
        this.strInA = newText;
    }

    public String toString(){
        return "A " + this.strInA + " " + this.dbInA;
    }
}
