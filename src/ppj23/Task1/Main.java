package ppj23.Task1;

public class Main {
    public static void main(String[] args) {
        boolean[] pokoje = {true, true, false, false, true, false};

        for (int i = 0; i < pokoje.length; i++) {
            try {
                DetektorDymu.sprawdzZadymienie(pokoje[i]);
            } catch (Alarm e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
