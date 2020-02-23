package day17_while_do_while_loop;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class GiveMe5Dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 dollars");
        int dollars  = scan.nextInt();
        while(dollars!=5){
            System.out.println("give me 5 dollars");
            dollars = scan.nextInt();
        }
        System.out.println("thank you");

        }
    }

