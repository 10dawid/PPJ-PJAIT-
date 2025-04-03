package ppj22.Task5;

public class Drzewo {
    boolean wiecznieZielone;
    int wysokosc;
    String przekrojDrzewa;

    Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    public boolean isWiecznieZielone() {
        return wiecznieZielone;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public String getPrzekrojDrzewa() {
        return przekrojDrzewa;
    }

    @Override
    public String toString() {
        return "Drzewo{" +
                "wiecznieZielone=" + wiecznieZielone +
                ", wysokosc=" + wysokosc +
                ", przekrojDrzewa='" + przekrojDrzewa + '\'' +
                '}';
    }
}
