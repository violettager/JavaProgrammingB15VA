package day05Practice;
import java.util.Scanner;
public class scannerPracticeTemperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hey \"Java \" what is the temperature today?");
        int Temperature = input.nextInt();
        System.out.println("is it \"F \" or \"c \"?");
        String name = input.next();
        System.out.println("Ok,todays weather is "+Temperature+name);






    }
}
