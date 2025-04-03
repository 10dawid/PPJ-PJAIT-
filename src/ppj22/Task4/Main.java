package ppj22.Task4;

public class Main {
    public static void main(String[] args) {
        Drzewo drzewo = new Drzewo(false, 10, "kwadrat");
        System.out.println(drzewo);
        System.out.println("---------------");

        DrzewoIglaste iglaste = new DrzewoIglaste(true, 20, "kolo", 10000, 12.4);
        System.out.println(iglaste);
        System.out.println("---------------");

        DrzewoLisciaste lisciaste = new DrzewoLisciaste(false, 5, "trojkat", 4);
        System.out.println(lisciaste);
        System.out.println("---------------");
        
        DrzewoOwocowe owocowe = new DrzewoOwocowe(false,10,"gwiazda", 2, "jablko");
        System.out.println(owocowe);
        System.out.println("owocowe.isWiecznieZielone() = " + owocowe.isWiecznieZielone());
        System.out.println("owocowe.getWysokosc() = " + owocowe.getWysokosc());
        System.out.println("owocowe.getPrzekrojDrzewa() = " + owocowe.getPrzekrojDrzewa());
        System.out.println("owocowe.getKsztaltLiscia() = " + owocowe.getKsztaltLiscia());
        System.out.println("---------------");
    }
}
