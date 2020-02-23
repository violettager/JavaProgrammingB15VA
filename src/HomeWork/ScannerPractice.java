package HomeWork;
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your State");
        String state = scan.next();
        System.out.println("Enter your zip code");
         int zipCode = scan.nextInt();
         String address = street+", "+state+", "+zipCode;
        System.out.println("My address is: "+address);
    }
}
