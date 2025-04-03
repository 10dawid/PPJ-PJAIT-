package ppj22.Task5;

public class DrzewoLisciaste extends Drzewo {
    int ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    public int getKsztaltLiscia() {
        return ksztaltLiscia;
    }

    @Override
    public String toString() {
        return "DrzewoLisciaste{" +
                "ksztaltLiscia=" + ksztaltLiscia +
                '}';
    }
}
