package ppj19.Task6;

public class Corn {
    private int cornCount;

    public Corn(int cornCount){
        this.cornCount = cornCount;
    }

    public Popcorn[] makePopcorn(){
        Popcorn[] popcorns = new Popcorn[cornCount];
        for(int i = 0; i < popcorns.length; i++){
            popcorns[i] = new Popcorn();
            System.out.println("POP!");
        }
        return popcorns;
    }
}
