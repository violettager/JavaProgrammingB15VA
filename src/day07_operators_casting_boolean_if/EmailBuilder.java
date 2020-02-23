package day07_operators_casting_boolean_if;
import java.util.Scanner;
public class EmailBuilder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String firstName, lastName,companyName, email;
        System.out.println("Enter your first name");
        firstName =input.next();
        System.out.println("Enter your last name");
        lastName = input.next();
        System.out.println("Enter your company name");
        companyName = input.next();
        System.out.println("your email is");
        email=(firstName+"_"+lastName+"@"+companyName+".com");
        System.out.println(email);


    }
}
