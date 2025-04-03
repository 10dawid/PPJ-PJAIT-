package training.finalTraining.exceptions;


import training.Static.MethodClass;

public class Main {

    public static void main(String[] args) {
//        try {
//            MethodE(10);
//        } catch(CheckedExc ChExc){
//            System.out.println(ChExc);
//        } finally {
//            System.out.println("end");
//        }
        MethodE(10);
    }
    public static void MethodE(int x) {
        for (int i = 0; i < x; i++) {
//            if (i == 5) throw new CheckedExc("i equals 5 now so i threw checkedException");
            if (i == 6) throw new UncheckedExc("i cant take it anymore");
            else System.out.println("i = " + i);
        }
    }

}
