package ppj23.Task4;
import java.util.LinkedList;

public class MyStackLinkedList {
    LinkedList<String> items = new LinkedList<String>();


    public void push(String item) {
        items.add(item);
    }
    public String pop() {
        String item = items.getLast();
        items.removeLast();
        return item;
    }

    @Override
    public String toString() {
        return "MyStackLinkedList{" +
                "items=" + items +
                '}';
    }
}
