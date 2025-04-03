package training.Nodes;

public class StackWithLinkedList {
    private Sll stackLinkedList = new Sll();



    public void push (int num){
        stackLinkedList.addFirst(new Node(num));
    }
    public int pop () throws emptyStack{
        if (!stackLinkedList.isEmpty()){
            int num = stackLinkedList.getHead().getValue();
            stackLinkedList.removeFirst();
            return num;
        }
        else throw new emptyStack("emptyStackException");
    }
}
