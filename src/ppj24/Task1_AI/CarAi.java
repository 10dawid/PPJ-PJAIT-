package ppj24.Task1_AI;

import java.util.Random;

public class CarAi {
    private int fuel;
    private int kilometers;
    private Random random;

    public CarAi() {
        this.fuel = 35;
        this.kilometers = 0;
        this.random = new Random();
    }

    public void fill(){
        if (random.nextInt(10) == 0){
            throw new ExplosionAi("BOOM");
        }

        this.fuel += 15 + random.nextInt(21);
        System.err.println("After filling "+ this.fuel);
    }

    public void drive100km() throws NotEnoughGasAi {
        if (this.fuel < 10) throw new NotEnoughGasAi("Only " + this.fuel+ " liters. Myst fill the tank");

        this.fuel -= 10;
        this.kilometers += 100;
        System.err.println(this.kilometers + " km driven, " + this.fuel + " liters left");
    }

}
