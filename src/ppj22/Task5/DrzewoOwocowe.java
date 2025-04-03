package ppj22.Task5;

import java.util.Random;

public class DrzewoOwocowe extends DrzewoLisciaste {
    String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString() {
        return "DrzewoOwocowe{" +
                "nazwaOwoca='" + nazwaOwoca + '\'' +
                '}';
    }

    public  Owoc zerwijOwoc(){
        Random random = new Random();
        int los = random.nextInt(3);

        Owoc owoc =  switch (los){
            case 0 -> new Gruszka();
            case 1 -> new Jablko();
            case 2 -> new Pomarancza();
            default -> null;
        };
        return owoc;
    }
}
