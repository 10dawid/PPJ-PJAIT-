package ppj24.Task3;

import java.util.Arrays;

class SimpleArrayList {
    private int size;
    private int cap;
    private Integer[] arr;
    private final int INITIAL_CAPACITY = 10;


    //constructors
    public SimpleArrayList(){
        this.size = 0;
        this.cap = INITIAL_CAPACITY;
        this.arr = new Integer[cap];
    }
    public SimpleArrayList(int item, int cap){
        this.cap = cap;
        this.arr = new Integer[cap];
        this.arr[0] = item;
    }
    public SimpleArrayList(int[] givenArray, int cap){
        this.cap = cap;
        this.arr = new Integer[cap];
        for(int i = 0; i < givenArray.length; i++)
            this.arr[i] = givenArray[i];
    }
    public SimpleArrayList(SimpleArrayList myArrayList){
        this.size = myArrayList.size();
        Integer[] newArr = new Integer[myArrayList.getCap()];
        this.cap = myArrayList.getCap();

        for (int i = 0; i < myArrayList.getArr().length; i++)
            newArr[i] = myArrayList.getArr()[i];
        this.arr = newArr;
    }

    //getters
    public int size() {
        return size;
    }
    public Integer[] getArr() {
        return arr;
    }
    public int getCap() {
        return cap;
    }

    public void clear(){
        this.size = 0;
        this.cap = INITIAL_CAPACITY;
        this.arr = new Integer[cap];
    }
    public void trim(){
        this.cap = size;
        Integer[] newArray = new Integer[this.cap];
        for (int i = 0; i < this.arr.length; i++) {
            newArray[i] = this.arr[i];
        }
        this.arr = newArray;
    }
    public SimpleArrayList insert(int ind, int[] other) throws IndexOutOfBoundsException{
        if (ind > this.size || ind < 0)
            throw new IndexOutOfBoundsException();

        int sz = other.length;
        int newArrayIndex = 0;

        if (size + sz > this.cap){
            this.cap = 2*(this.size + sz);
            Integer[] newArr = new Integer[this.cap];

            for (int i = 0; i < ind; i++)
                newArr[newArrayIndex++] = this.arr[i];

            for (int i = 0; i < other.length; i++)
                newArr[newArrayIndex++] = other[i];

            for(int i = ind; i < this.size; i++)
                newArr[newArrayIndex++] = this.arr[i];
            this.size += sz;
        }
        else{
            Integer[] newArr = new Integer[this.cap];

            for (int i = 0; i < ind; i++)
                newArr[newArrayIndex++] = this.arr[i];

            for (int i = 0; i < other.length; i++)
                newArr[newArrayIndex++] = other[i];

            for(int i = ind; i < this.size; i++)
                newArr[newArrayIndex++] = this.arr[i];
            this.size += sz;
        }
        return this;

    }
    public SimpleArrayList insert(int ind, int e){
        int[] other = {e};
        this.insert(ind, other);
        return this;
    }
    public SimpleArrayList append(int e){
        int[] other = {e};
        this.insert(this.size, other);
        return this;
    }
    public SimpleArrayList append(int[] a){
        this.insert(this.size, a);
        return this;
    }
    public SimpleArrayList append(SimpleArrayList a){
        int[] other = new int[a.size];
        for (int i = 0; i < a.size; i++) {
            other[i] = a.getArr()[i];
        }
        this.insert(size, other);
        return this;
    }
    public int get(int ind) throws IndexOutOfBoundsException{
        if (ind < 0 || ind > this.cap) throw new IndexOutOfBoundsException();
        else
            return this.arr[ind];
    }
    public SimpleArrayList set(int ind, int val) throws IndexOutOfBoundsException{
        if (ind < 0 || ind > this.cap) throw new IndexOutOfBoundsException();
        else
            this.arr[ind] = val;
        return this;
    }

    @Override
    public String toString() {
        return getClass().getName() + "-> "+ "cap = " + this.cap + ", size = " + this.size + Arrays.toString(this.arr);

    }
}
