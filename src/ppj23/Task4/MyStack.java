package ppj23.Task4;

import java.util.Arrays;

public class MyStack {
    int size;
    String[] items;
    int top = -1;

    public MyStack(int size) {
        this.size = size;
        items = new String[size];
    }

    public void push(String item) {
        items[++top] = item;
    }
    public String pop() {
        return items[top--];
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "size=" + size +
                ", items=" + Arrays.toString(items) +
                ", top=" + top +
                '}';
    }
}
