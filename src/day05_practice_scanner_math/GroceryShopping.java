package day05_practice_scanner_math;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Harris Teeter!");
        System.out.println("how much are potatoes?");
        double potatoes = input.nextDouble() ;
        System.out.println("How much are tomatoes?");
        double tomatoes = input.nextDouble();
        //4.99
        System.out.println("How much are eggplants?");
        double eggplants = input.nextDouble();
        double Total = potatoes + tomatoes+eggplants;
        System.out.println("Total is $"+Total);

    }
}
