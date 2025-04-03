package training.Nodes;

public class Main {
    public static void main(String[] args) {

        Sll myLinkedL = new Sll();
        myLinkedL.addFirst(new Node(1));
        myLinkedL.addLast(new Node(2));
        myLinkedL.addLast(new Node(3));
        myLinkedL.addLast(new Node(4));
        myLinkedL.addLast(new Node(5));
        myLinkedL.addLast(new Node(6));
        myLinkedL.addLast(new Node(7));
        myLinkedL.addFirst(new Node(0));

        System.out.println(myLinkedL);
        System.out.println("myLinkedL.removeFirst()");
        myLinkedL.removeFirst();
        System.out.println(myLinkedL);
        myLinkedL.removeLast();
        System.out.println("myLinkedL.removeLast()");
        System.out.println(myLinkedL);
    }
}
