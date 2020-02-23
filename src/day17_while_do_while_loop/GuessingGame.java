package day17_while_do_while_loop;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secretNumber = 6;
        int guessNumber =0;
        do {
            System.out.println("guess the secret number");
             guessNumber = scan.nextInt();
            if(guessNumber>secretNumber){
                System.out.println("Wrong, your number is too large");

            }else if(guessNumber<secretNumber){
                System.out.println("Wrong, your number is smaller than we have");
            }
        }while(guessNumber!=secretNumber);
        System.out.println("congratulations you won");

    }
}