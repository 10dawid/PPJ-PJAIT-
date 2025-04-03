package training.kolokwiumProbne;

class C extends B{
    int a;
    public C(int a, int a1) {
        super();
        this.a = a1;
        System.out.println("C");
    }
    public C(int a, char c, int a1) {
        super(a, c);
        this.a = a1;
    }
    public void fun(){
        System.out.println(super.a);
        super.fun();
    }
}