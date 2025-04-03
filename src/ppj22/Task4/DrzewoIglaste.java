package ppj22.Task4;

public class DrzewoIglaste extends Drzewo {
    int iloscIgiel;
    double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    public int getIloscIgiel() {
        return iloscIgiel;
    }

    public double getDlugoscSzyszki() {
        return dlugoscSzyszki;
    }

    @Override
    public String toString() {
        return "DrzewoIglaste{" +
                "iloscIgiel=" + iloscIgiel +
                ", dlugoscSzyszki=" + dlugoscSzyszki +
                '}';
    }
}
