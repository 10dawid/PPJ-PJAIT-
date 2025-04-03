package ppj26.Task2;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("src//ppj26//Task2//data.txt");
            BufferedReader br = new BufferedReader(fr);

            int numOfPeople = Integer.parseInt(br.readLine());
            Person[] persons = new Person[numOfPeople];
            for (int i = 0; i < numOfPeople; i++) {
                String personDataAsString = br.readLine();
                String[] dataInArray = personDataAsString.split("\\s+");
                int birthYear = Integer.parseInt(dataInArray[1]);
                if (dataInArray.length > 2){
                    int red = Integer.parseInt(dataInArray[3]);
                    int green = Integer.parseInt(dataInArray[4]);
                    int blue = Integer.parseInt(dataInArray[5]);
                    persons[i] = new Person(dataInArray[0],birthYear,new Car(dataInArray[2],new Color(red, green, blue)));
                }else{
                    persons[i] = new Person(dataInArray[0],birthYear);
                }
            }
            br.close();
            fr.close();
            Car[] cars = Person.findAllCars(persons);
            for(Car car : cars)
                System.out.println(car);
            System.out.println("=========================================================");
            Color myColor = Person.findColor(persons,"Kenny",1991);
            System.out.println(myColor);
            System.out.println("=========================================================");
            Person[] owners = Person.findOwners(persons, "Mercedes");
            for(Person owner : owners)
                System.out.println(owner);


        } catch (Exception e) {
            System.out.println("sth went wrong");
            throw new RuntimeException(e);
        }

    }
}
