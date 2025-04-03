package training.kolokwiumOstatnieZadanie;

public class B extends A{
    int intInB;
    public B(String strInA, double dbInA, int intInB){
        super(strInA, dbInA);
        this.intInB = intInB;
    }

    @Override
    public String toString() {
        return "B " + super.strInA + " " + super.dbInA + " " + this.intInB;
    }
}
