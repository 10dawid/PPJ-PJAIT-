package training.Nodes;

public class LLStackTest {
    public static void main(String[] args) {
        StackWithLinkedList myStack = new StackWithLinkedList();

        for (int i = 0; i < 5; i++)
            myStack.push(i);


        for (int i = 0; i < 6; i++) {
            try{
                System.out.println(myStack.pop());
            } catch (emptyStack e) {
                System.out.println("you tried to pop an item from empty stack");
                System.out.println(e.getMessage());
            }
        }
    }
}
