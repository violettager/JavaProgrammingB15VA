package day07_operators_casting_boolean_if;
import java.util.Scanner;
public class Multiplier {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplier! \n print two numbers");
        int num1,num2,results;

        num1 = input.nextInt();
        num2 = input.nextInt();
        results = num1*num2;
        System.out.println("Your answer is: " +results);

    }
}
