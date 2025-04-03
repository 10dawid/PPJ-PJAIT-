package ppj24.start;


import ppj24.start.singleLinkList.SLL;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = array;

        SLL sllBack = new SLL();
        sllBack.addToBack(5);
        sllBack.addToBack(6);
        sllBack.addToBack(7);

        System.out.println(sllBack);

        SLL sllFront = new SLL();
        sllFront.addToFront(5);
        sllFront.addToFront(6);
        sllFront.addToFront(7);

        System.out.println(sllFront);

        LinkedList<Integer> inSLL = new LinkedList<>();
        inSLL.add(5);
        inSLL.add(6);
        inSLL.add(7);
        System.out.println(inSLL);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        System.out.println(arrayList);
    }
}
