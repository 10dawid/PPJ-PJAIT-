package training.Nodes;

public class Sll {
    private Node head = null;
    private Node tail = null;
    private int size = 0;


    public void addFirst(Node newHead){
        if(this.size == 0){
            this.head = newHead;
            this.tail = newHead;
        } else if(this.size == 1){
            this.head = newHead;
            head.setNext(tail);
        } else{
            newHead.setNext(head);
            this.head = newHead;
        }
        this.size++;
    }
    public void addLast(Node newTail){
        if(this.size == 0){
            this.head = newTail;
            this.tail = newTail;
        } else if (this.size == 1) {
            this.tail = newTail;
            this.head.setNext(newTail);
        }else{
            this.tail.setNext(newTail);
            this.tail = newTail;
        }
        this.size++;
    }
    public void removeFirst(){
        if (this.size < 1) return;
        this.head = this.head.getNext();
        this.size--;
        if(this.size == 0){
            this.head = null;
            this.tail= null;
        }

    }
    public void removeLast(){
        Node previousNode = null;
        Node currentNode = this.head;
        while (!currentNode.isLast()){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        this.tail = previousNode;
        this.tail.setNext(null);
        this.size--;
    }
    public boolean isEmpty(){
        if (this.size == 0) return true;
        return false;
    }


    //getters
    public Node getHead() {
        return head;
    }
    public int getSize() {
        return size;
    }
    public Node getTail() {
        return tail;
    }

    @Override
    public String toString() {
        Node currentNode = this.head;
        StringBuilder sb = new StringBuilder();
        while(currentNode.getNext() != null){
            sb.append(currentNode.getValue());
            sb.append(" -> ");
            currentNode = currentNode.getNext();
        }
        sb.append(currentNode.getValue());
        return sb.toString();
    }
}
