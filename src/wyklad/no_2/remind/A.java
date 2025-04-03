package wyklad.no_2.remind;
public class A {
    private int val;
    private String name;

    public A(int val, String name) {
        this.val = val;
        this.name = name;
    }
    public A(int val){
        this(val, "");      //odwolanie do konstruktora z 7 wiersza
    }
    public A(String str){
        this(0,str);        //odwolanie do konstruktora z 7 wiersza
    }
    public String toString() {
        return name + ": " + val;
    }
    public boolean equals(A a1) {
        if (name.equals(a1.name)){ // comparing two strings
            return val == a1.val;
        }
        return false;
    }
}
