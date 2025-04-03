package ppj24.start.singleLinkList;

public class SLL {

    Node head;

    public void addToBack (int value){
        if(head == null){
            head = new Node(value);
            return;
        }
        if(head.next == null){
            head.next = new Node(value);
            return;
        }
        Node temp = head.next;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(value);
    }

    public void addToFront(int value){
        Node neo = new Node(value, head);
        head = neo;
    }

    public String toString(){
        String str = head + " ";
        Node temp = head.next;
        while (temp != null){
            str += temp + " ";
            temp = temp.next;
        }
        return str;
    }

}
