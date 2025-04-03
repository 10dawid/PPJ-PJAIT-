package ppj23.Task2;

public class Main {
    public static void main(String[] args) {
        Rakieta rakieta = new Rakieta(200, "Falcon");

        while(!rakieta.isCzyLeci()){
            System.out.println(rakieta);
            System.out.println("Podejście do startu");
            try{
                rakieta.start();
            } catch(BrakPaliwa e){
                System.out.println(e.getMessage());
                rakieta.zatankuj();
                System.out.println();
            }
        }
    }
}
