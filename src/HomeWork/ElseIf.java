package HomeWork;
import java.util.Scanner;
public class ElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("your grades");
        int grade1 = input.nextInt();


        if (grade1 >80 ) {
            System.out.println("you will get whatever you want");
        } else if (grade1> 70) {
            System.out.println("you will get whatever i want you to have");

        } else {
            System.out.println("you won't get anything");


        }
    }   }
