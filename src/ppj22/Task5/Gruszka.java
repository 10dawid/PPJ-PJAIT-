package ppj22.Task5;

import java.util.Random;

public class Gruszka extends Owoc{
    public Gruszka() {
        super("Gruszka", 100 + new Random().nextDouble() * 150);

    }
}
