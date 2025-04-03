package ppj23.Task1;

public class DetektorDymu{
    public static void sprawdzZadymienie(boolean czyZadymienie) throws Alarm {
        if (czyZadymienie) {
            throw new Alarm();
        }
        else System.out.println("jest bezpiecznie");
    }
}

