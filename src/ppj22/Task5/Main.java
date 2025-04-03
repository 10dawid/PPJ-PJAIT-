package ppj22.Task5;


public class Main {
    public static void main(String[] args) {
        DrzewoOwocowe drzewko = new DrzewoOwocowe(false, 10, "kolo", 2, "owocowe");
        System.out.println(drzewko);
        Owoc[] owoce = new Owoc[100];

        double totalMasa = 0;
        int jablka = 0;
        int gruszki = 0;
        int pomarancze = 0;
        int index = 0;

        while(totalMasa < 5000 && index < owoce.length) {
            Owoc owoc = drzewko.zerwijOwoc();
            owoce[index] = owoc;
            totalMasa += owoc.getMasa();
            switch(owoc.getNazwa()){
                case "Jablko" -> jablka++;
                case "Gruszka" -> gruszki++;
                case "Pomarancza" -> pomarancze++;
            }
            index++;
        }
        System.out.println("jablka = " + jablka);
        System.out.println("gruszki = " + gruszki);
        System.out.println("pomarancze = " + pomarancze);
        System.out.println("totalMasa = " + totalMasa);
    }
}
