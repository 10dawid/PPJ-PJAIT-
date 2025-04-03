package ppj22.Task5;

import java.util.Random;

public class Jablko extends Owoc{
    public Jablko() {
        super("Jablko", 100 + new Random().nextDouble() * 150);
    }
}
