package day11_string_comparison_logical;
import java.util.Scanner;
public class AmazonShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.println("Are you a prime member?");
    Boolean isPrimeMember = scan.nextBoolean();
        System.out.println("Enter Total order price");
    double totalPrice = scan.nextDouble();

    if(totalPrice< 0 ){
        System.out.println("Invalid order Price!");
        return;//stop program at this point. do not run the rest of the code below.
    }


    if(isPrimeMember||totalPrice>=25.0){
        System.out.println("Your order is eligible for free shipping");
    }else{
        System.out.println("Your order is not eligible for free shipping");
    }



}}
