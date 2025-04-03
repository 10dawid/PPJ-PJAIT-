package ppj22.Task6;

public class Osoba {
    String imie;
    String nazwisko;
    String numer;

    Osoba(String imie, String nazwisko, String numer) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " " + numer;
    }
}
