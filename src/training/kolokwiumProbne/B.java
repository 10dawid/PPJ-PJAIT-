package training.kolokwiumProbne;

class B extends A{
    int a;
    public B(int a) {
        this.a = a;
        System.out.println("B");
    }
    public B(){
        this(5);
        System.out.println("BB");
    }
    public B(int a, char c) {
        super(c);
        this.a = a;
    }
    @Override
    public void fun(){
        System.out.println(this.a);
        super.fun();
    }
}