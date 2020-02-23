package HomeWork;
import java.util.Scanner;
import java.util.SortedMap;

public class WhileLoopScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many sandwiches do you have?");
        int sandwich =input.nextInt();

        while(sandwich<=10){
            System.out.println("Eating sandwiches"+ sandwich);
            sandwich++;

        }
        System.out.println("you have no more sandwiches");


        System.out.println("Enter the number");

        int number = input.nextInt();
        int count = 1;

        while(count<=number){
            System.out.print(count+", ");
            count++;
        }
        System.out.println("the end of the count");



        System.out.println("Enter the number");

        int number2 = input.nextInt();
        int count2 = 1;

        while(count2<=number2){
            System.out.print(count2+", ");
            count2+=2;
        }
        System.out.println("the end of the count");
    }

}
