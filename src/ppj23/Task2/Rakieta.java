package ppj23.Task2;

public class Rakieta {
    private String nazwa;
    private int wagaPaliwa;
    private boolean czyLeci;

    public Rakieta(int wagaPaliwa,  String nazwa) {
        this.wagaPaliwa = wagaPaliwa;
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWagaPaliwa() {
        return wagaPaliwa;
    }

    public boolean isCzyLeci() {
        return czyLeci;
    }

    @Override
    public String toString() {
        return "Rakieta{" +
                "nazwa='" + nazwa + '\'' +
                ", wagaPaliwa=" + wagaPaliwa +
                '}';
    }

    public void zatankuj(){
        wagaPaliwa += (int) (Math.random()*300);
    }

    public void start() throws BrakPaliwa{
        if (wagaPaliwa > 1000){
            czyLeci = true;
            System.out.println("udana procedura startowa, rakieta odleciala");
        }
        else throw new BrakPaliwa();
    }
}
