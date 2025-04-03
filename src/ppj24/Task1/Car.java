package ppj24.Task1;

import java.util.Random;

public class Car {
    private int fuelTank = 35;
    private int mileage = 0;



    public int getFuelTank() {
        return fuelTank;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelTank=" + fuelTank +
                ", mileage=" + mileage +
                '}';
    }

    public void fill() throws Explosion{
        Random random = new Random();
        int num = random.nextInt(10) + 1;
        if (num == 1){
            throw new Explosion();
        }
        else{
            fuelTank += 10;
            System.out.println("fuelTank after filling: "+fuelTank);
            System.out.println(this);
        }
    }

    public void drive100km() throws NotEnoughGas{
        if (fuelTank < 5) throw new NotEnoughGas();
        else{
            fuelTank -= 5;
            mileage += 100;
            System.out.println(this);
        }
    }

}
