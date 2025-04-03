package ppj23.Task4;

public class Main {
    public static void main(String[] args) {
        {
            MyStack stos = new MyStack(3);

            stos.push("pierwszy");
            stos.push("drugi");
            stos.push("trzeci");
//        stos.push("item"); // ArrayIndexOutOfBoundException
            System.out.println(stos);

            System.out.println(stos.pop());
            System.out.println(stos.pop());
            System.out.println(stos.pop());
        }
        System.out.println("\n----------------\n");
        {
            MyStackLinkedList stos = new MyStackLinkedList();
            stos.push("pierwszy");
            stos.push("drugi");
            stos.push("trzeci");
            System.out.println(stos);


            System.out.println(stos.pop());
            System.out.println(stos.pop());
            System.out.println(stos.pop());
        }
    }
}
