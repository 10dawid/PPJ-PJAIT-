package ppj22.Task6;

public class Main {
    public static void main(String[] args) {
        Osoba jan = new Osoba("Jan", "Kowalski", "111-111");
        Osoba adam = new Osoba("Adam", "Nowak", "222-222");
        Osoba piotr = new Osoba("Piotr", "Piotr", "333-333");

        Osoba[] osoby = {jan, adam, piotr};

        Telefon telefon = new Telefon("GSM", "red");
        Komorka komorka = new Komorka("LTE", "black");
        Smartfon smartfon = new Smartfon("5G", "blue", osoby);

        Telefon[] telefony = {telefon, komorka, smartfon};

        telefony[0].zadzwon("111-111");
        telefony[0].zadzwon("111-111");
        telefony[0].zadzwon("111-111");
        telefony[0].zadzwon("222-222");
        telefony[0].zadzwon("222-222");
        telefony[0].zadzwon("333-333");
        telefony[0].zadzwon("123-456");
        telefony[0].zadzwon("555-555");
        telefony[0].zadzwon("666-666");
        telefony[0].zadzwon("777-777");

        System.out.println(telefony[0]);
        telefony[0].wyswietlPolaczenia();

        System.out.println("---------------");


        telefony[1].zadzwon("ma byc niewidoczny");
        telefony[1].zadzwon("123-456");
        telefony[1].zadzwon("666-666");
        telefony[1].zadzwon("111-111");
        telefony[1].zadzwon("111-111");
        telefony[1].zadzwon("222-222");
        telefony[1].zadzwon("333-333");
        telefony[1].zadzwon("111-111");
        telefony[1].zadzwon("777-777");
        telefony[1].zadzwon("456-789");
        telefony[1].zadzwon("333-333");

        System.out.println(telefony[1]);
        telefony[1].wyswietlPolaczenia();

        System.out.println("---------------");

        telefony[2].zadzwon("ma byc niewidoczny");
        telefony[2].zadzwon("123-456");
        telefony[2].zadzwon("666-666");
        telefony[2].zadzwon("111-111");
        telefony[2].zadzwon("111-111");
        telefony[2].zadzwon("222-222");
        telefony[2].zadzwon("333-333");
        telefony[2].zadzwon("111-111");
        telefony[2].zadzwon("777-777");
        telefony[2].zadzwon("456-789");
        telefony[2].zadzwon("333-333");

        System.out.println(telefony[2]);
        telefony[2].wyswietlPolaczenia();










    }
}
