package ppj22.Task6;
public class Komorka extends Telefon{
    String[] ostatniePolaczenia = new String[10];

    public Komorka(String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
    }

    @Override
    public void zadzwon(String telefon) {
        boolean dodane = false;
        for(int i = 0; i < ostatniePolaczenia.length; i++){
            if (ostatniePolaczenia[i] == null){
                ostatniePolaczenia[i] = telefon;
                dodane = true;
                break;
            }
        }
        if(!dodane){
            for(int i = 0; i < ostatniePolaczenia.length - 1; i++){
                ostatniePolaczenia[i] = ostatniePolaczenia[i+1];
            }
            ostatniePolaczenia[ostatniePolaczenia.length - 1] = telefon;
        }
        super.zadzwon(telefon);
    }

    @Override
    public void wyswietlPolaczenia(){
        System.out.println("ostatnie polaczenia: {");
        for(int i = 0; i < ostatniePolaczenia.length; i++){
            if(ostatniePolaczenia[i] != null){
                System.out.println(ostatniePolaczenia[i]);
            }
        }
        System.out.println("}");
    }

    @Override
    public String toString() {
        return "komorka: " + super.toString();
    }
}
