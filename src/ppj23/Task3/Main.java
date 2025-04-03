package ppj23.Task3;

public class Main {
    public static void main(String[] args) {
//        MyQueue kolejka = new MyQueue();
//        kolejka.put("pierwszy");
//        System.out.println(kolejka);
//        System.out.println("------------");
//        kolejka.put("drugi");
//        System.out.println(kolejka);
//        System.out.println("------------");
//        kolejka.put("trzeci");
//        System.out.println(kolejka);
//        System.out.println("------------");
//        kolejka.put("czwarty");
//        System.out.println(kolejka);
//        System.out.println("------------");
//        System.out.println("------------");
//
//
//        System.out.println(kolejka.get());
//        System.out.println("------------");
//        System.out.println(kolejka);
//        System.out.println("------------");
//        System.out.println(kolejka.get());
//        System.out.println("------------");
//        System.out.println(kolejka);
//        System.out.println("------------");


        String[] koszykA = {"PSG", "Atletico Madryt", "Sporting CP", "Inter", "Benfica", "Villarreal", "RB" ,"Salzburg", "Chelsea"};
        String[] koszykB = {"Manchester City", "Liverpool", "Ajax Amsterdam", "Real Madryt", "Bayern Monachium", "Manchester United", "Lille", "Juventus"};

        MyQueue kolejkaSportowa = new MyQueue();

        for (int i = 0; i < koszykA.length; i++) {
            kolejkaSportowa.put(koszykA[i]);
            if(i < koszykB.length){
                kolejkaSportowa.put(koszykB[i]);
            }
        }
        System.out.println(kolejkaSportowa);
        String a = "";
        String b = "";

        while (kolejkaSportowa.getSize() > 0){
            System.out.println(kolejkaSportowa.get() + " : " + kolejkaSportowa.get());
        }
    }
}
