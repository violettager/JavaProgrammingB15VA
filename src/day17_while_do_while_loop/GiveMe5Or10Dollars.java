package day17_while_do_while_loop;
import java.util.Scanner;
public class GiveMe5Or10Dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 or 10 dollars");
        int dollars  = scan.nextInt();
        while(dollars!=5 && dollars!=10){
            System.out.println("give me 5 or 10 dollars");
            dollars = scan.nextInt();
        }
        System.out.println("thank you for $"+dollars);

    }
}
