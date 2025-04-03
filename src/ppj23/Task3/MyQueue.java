package ppj23.Task3;

import java.util.Arrays;

public class MyQueue {
    String[] items;
    int size = 0;

    public MyQueue() {
        String[] emptyItems = {};
        items = emptyItems;
    }

    public MyQueue(String[] items) {
        this.items = items;
        size = items.length;
    }

    public void put(String item) {
        if (size == 0){
            items = new String[size + 1];
            items[0] = item;
            size = 1;
        }
        else {
            String[] newItems = new String[size + 1];
            for (int i = 0; i < size; i++) {
                newItems[i] = items[i];
            }
            newItems[size] = item;
            size += 1;
            items = newItems;
        }
    }

    public String get() {
        if (size == 0){
            return null;
        }
        String temp = items[0];
        if(size > 1){
            String[] newItems = new String[size - 1];
            for (int i = 1; i < size; i++) {
                newItems[i - 1] = items[i];
            }
            items = newItems;
            size -= 1;
            return temp;
        }
        else{
            String[] emptyItems = {};
            items = emptyItems;
            size -= 1;
            return temp;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "items=" + Arrays.toString(items) +
                ", size=" + size +
                '}';
    }
}
