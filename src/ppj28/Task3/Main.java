package ppj28.Task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("src/ppj28/stud.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            System.out.println(line);
            line = br.readLine();
            while(line != null){
                String[] studentData = line.trim().split(";");
                System.out.print(Arrays.toString(studentData));
                Pattern pattern = Pattern.compile("^.+a$");
                Matcher matcher = pattern.matcher(studentData[1]);
                if(matcher.matches()) System.out.println("kobieta");
                else System.out.println("mezczyzna");

                line = br.readLine();
            }
        }catch(FileNotFoundException fnfe){
            System.out.println("the file was not found");
            System.out.println(fnfe.getMessage());
        }
        catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}
