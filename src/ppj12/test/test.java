package ppj12.test;

public class test {
    public static void main(String[] args) {
        boolean tb = true;
        int stars = 9;
        for(int j = 0; tb || j >= 0; j += tb ? 1 : -1){
            for(int i = 0; i < stars - j; i++)
                System.out.print(i < j ? " " : "*");
            System.out.println();
            if (j == 4) tb = !tb;
        }
    }
}
