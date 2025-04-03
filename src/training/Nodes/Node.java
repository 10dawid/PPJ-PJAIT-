package training.Nodes;

public class Node {
    private Node next = null;
    private int value;

//    public Node(int value, Node next){
//        this.value = value;
//        this.next = next;
//    }
    public Node(int value){
        this.value = value;
    }

    public Node getNext() {
        return next;
    }
    public int getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public boolean isLast(){
        if (this.next == null) return true;
        return false;
    }


}
