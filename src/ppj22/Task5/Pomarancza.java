package ppj22.Task5;

import java.util.Random;

public class Pomarancza extends Owoc{
    public Pomarancza() {
        super("Pomarancza", 100 + new Random().nextDouble() * 150);

    }
}
