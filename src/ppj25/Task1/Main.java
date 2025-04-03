package ppj25.Task1;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> count = new ArrayList<>();
        ArrayList<Character> chars = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream("src/ppj25/Task1/tsk1.txt");
            int fileInput;
            do{
                fileInput = fis.read();
                if (fileInput == 10) fileInput = fis.read();
                if (fileInput == 3) fileInput = fis.read();
                char currentChar = (char) fileInput;
                boolean found = false;
                for (int i = 0; i < chars.size(); i++) {
                    if (currentChar == chars.get(i)){
                        found = true;
                        count.set(i, count.get(i)+1);
                    }
                }
                if( !found ){
                    chars.add(currentChar);
                    count.add(1);
                }
            }while(fileInput != -1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(chars);
        System.out.println(count);
    }
}
