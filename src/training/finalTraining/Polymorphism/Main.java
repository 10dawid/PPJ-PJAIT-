package training.finalTraining.Polymorphism;

public class Main {
    //Polimorfizm - ukrywanie informacji i danych ktorych nie
   // chcemy aby zmienial nasz klient.

    public static void main(String[] args) {
        Poly poly = new Poly("Polymorphism", 150);
        System.out.println("poly.getName() = " + poly.getName());
        System.out.println("poly.getNumber() = " + poly.getNumber());
    }    
    
}
