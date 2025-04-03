package training.Nodes;

public class StackWithNodes {
    private Node top;
    private Node bottom;
    private int size = 0;


    public void push(int item){
        if (this.size == 0){
            this.top = new Node(item);
            this.bottom = new Node(item);
            // top = bottom
            this.size++;
        }else if (this.size == 1){
            this.top = new Node(item);
            this.bottom.setNext(this.top);
            this.size++;
        }else{
            Node newTop = new Node(item);
            this.top.setNext(newTop);
            this.top = newTop;
            this.size++;
        }
    }
    public Node pop() throws emptyStack{
        if (this.size == 0) throw new emptyStack("the stack is empty");
        else if (this.size == 1){
            this.size --;
            Node ret = new Node(this.top.getValue());
            this.top = null;
            this.bottom = null;
            return ret;
        }else{
            Node oneBeforeTop = this.bottom;
            while(!oneBeforeTop.isLast()){
                oneBeforeTop = oneBeforeTop.getNext();//sus
            }
            Node toReturn = this.top;
            this.top = oneBeforeTop;
            this.size--;
            return toReturn;
        }
    }
    public boolean empty(){
        return (this.size == 0 ? true : false);
    }

}
