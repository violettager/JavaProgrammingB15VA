package day05Practice;
import java.util.Scanner;
public class Convertation {
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.println("How many pound of sugar you need for this recipe?");
        double sugar = info.nextDouble();
        System.out.println("Let me tell you how much it will be in kg.");
        double kg = sugar*0.453;
        System.out.println("You will need "+kg+" kg");



    }
}
