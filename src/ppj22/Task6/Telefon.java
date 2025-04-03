package ppj22.Task6;

public class Telefon {
    String interfejsKomunikacyjny;
    String color;

    public Telefon(String interfejsKomunikacyjny,  String color) {
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
        this.color = color;
    }

    public void zadzwon(String numer){
        System.out.println("calling --> " + numer);
    }

    public void wyswietlPolaczenia(){
        System.out.println("brak historii polaczen");
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "interfejsKomunikacyjny='" + interfejsKomunikacyjny + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
