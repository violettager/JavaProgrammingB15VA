package day06_operators;
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fahrenheit value: ");
        double fahrenheit = input.nextDouble();
        double celsius  = ((fahrenheit-32)*5/9);
        System.out.println(fahrenheit+" is " +celsius+" in celsius.");

        System.out.println("********************************************************");

        System.out.println("Enter celsius value ");
        celsius  = input.nextDouble();
        fahrenheit = (celsius*9/5+32);
        System.out.println(celsius +" is "+fahrenheit+" in fahrenheit.");













    }
}
