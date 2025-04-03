package ppj24.Task1_AI;


public class ExceptsAi {
    public static void main(String[] args) {
        CarAi carAi = new CarAi();
        while (true) {
            try {
                carAi.drive100km();
            } catch (NotEnoughGasAi e) {
                System.err.println(e.getMessage());
                carAi.fill();
            }
        }
    }
}