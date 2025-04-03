package training.Nodes;

public class NodeStackTest {
    public static void main(String[] args) {
        StackWithNodes myNodeStack = new StackWithNodes();

        for (int i = 0; i < 5; i++) {
            myNodeStack.push(i);
        }

        for (int i = 0; i < 6; i++) {
            try{
                System.out.println(myNodeStack.pop().getValue());
            }
            catch (emptyStack e){
                System.out.println(e.getMessage());
            }
        }

    }
}
