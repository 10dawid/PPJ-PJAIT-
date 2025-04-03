package ppj22.Task6;

public class Smartfon extends Komorka{
    Osoba[] znajomi;

    public Smartfon(String interfejsKomunikacyjny, String color, Osoba[] znajomi) {
        super(interfejsKomunikacyjny, color);
        this.znajomi = znajomi;
    }

    @Override
    public void wyswietlPolaczenia(){
        for(int i = 0; i < ostatniePolaczenia.length; i++){
            boolean wypisane = false;
            for(int j = 0; j < znajomi.length; j++){
                Osoba znajomy = znajomi[j];
                if(znajomy.numer.equals(ostatniePolaczenia[i])){
                    System.out.println(znajomy);
                    wypisane = true;
                    break;
                }
            }
            if(!wypisane) System.out.println(ostatniePolaczenia[i]);
            }
        }
    @Override
    public String toString() {
        return "smartfon: " + super.toString();
    }
}




