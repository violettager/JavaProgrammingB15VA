package day11_string_comparison_logical;
import java.util.Scanner;
public class CarShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int budget = 35000;
        System.out.println("Welcome to our Car Dealership!");
        System.out.println("Enter model");
        String carModel  = scan.next();
        System.out.println("Enter price");
        double  carPrice = scan.nextDouble();

        if(carModel.equalsIgnoreCase("toyota")|| carModel.equalsIgnoreCase("audi")|| carModel.equalsIgnoreCase("tesla") && carPrice<=budget){
            System.out.println("I am interested in purchasing this car");
        }else{
            System.out.println("I am not interested in buying this car");
        }
    }
}

