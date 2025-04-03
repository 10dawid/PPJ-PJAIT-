package ppj24.nodesTraining;

public class Node {
    public int value;
    private Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }

    public void setNextNode(Node node){
        this.next = node;
    }

    public Node getNextNode(){
        return this.next;
    }




    public static void main(String[] args) {
        Node start = new Node(1);
        Node mid = new Node(2);
        Node end = new Node(3);

        start.setNextNode(mid);
        mid.setNextNode(end);

        Node currentNode = start;

        while(currentNode != null){
            System.out.println(currentNode.value);
            currentNode = currentNode.getNextNode();
        }

    }
}

