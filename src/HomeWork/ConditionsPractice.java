package HomeWork;
import java.util.Scanner;
public class ConditionsPractice {
    public static void main(String[] args) {
        //we create an object of Scanner class
        //to get input from keyboard
        Scanner scan = new Scanner(System.in);
        System.out.println("Can you enter your score");
        int score = scan.nextInt();
        //if score is greater than 75, then print passed
        //otherwise,print failed

        if(score>=75){
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}
