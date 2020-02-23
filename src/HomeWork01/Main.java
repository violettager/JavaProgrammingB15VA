package HomeWork01;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName, lastName, fullName, email, street, state, city, address, contacts;
        int age, zipCode;
        double height, weight;
        boolean isMarried;
        long workPhoneNumber, personalIphoneNumber;
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        firstName = input.next();
        System.out.println(firstName);
        System.out.println("Enter your lastName");
        lastName = input.next();
        System.out.println(lastName);
        System.out.println("Enter your email");
        email = input.next();
        System.out.println(email);
        System.out.println("Enter your street");
        street = input.next();
        System.out.println(street);
        System.out.println("Enter your city");
        city = input.next();
        System.out.println(city);
        System.out.println("Enter your state");
        state = input.next();
        System.out.println(state);
        System.out.println("Enter your zip code");
        zipCode = input.nextInt();
        System.out.println("Enter your");
    }
}