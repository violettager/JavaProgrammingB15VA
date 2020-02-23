package day06_operators;
import java.util.Scanner;
public class DayToMinutes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of days:");
        int days = input.nextInt();
        int minutes = days*1440;
        System.out.println("in minutes it will be: "+minutes);

    }

}
