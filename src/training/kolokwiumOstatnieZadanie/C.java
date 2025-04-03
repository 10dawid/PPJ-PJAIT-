package training.kolokwiumOstatnieZadanie;

public class C extends A{
    String strInC;

    public C(String strInA, double dbInA, String strInC){
        super(strInA, dbInA);
        this.strInC = strInC;
    }
    public String toString(){
        return "C " + super.strInA + " " + super.dbInA + " " + strInC;
    }
}
