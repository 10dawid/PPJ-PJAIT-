package training.finalTraining.OverrideOrOverload;

public class MyClass {
    int x = 10;
    int y = 10;

    public int sum(){
        return this.x + this.y;
    }
    public int sum(int num){
        return this.x + this.y + num;
    }
    //Two methods above this line show how Method Overloading works


    @Override
    public String toString(){
        return this.x + " " + this.y;
    }
    // this is override. We overrode method toString() from Object class which is parent class for every class we make in java
}
