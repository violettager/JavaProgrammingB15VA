package day11_string_comparison_logical;
import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int month = input.nextInt();

        if (month==3||month==4||month==5){ //if(month>=3 && month<=5){  SAME THING!
            System.out.println("it is Spring!");
        }else if  (month==6||month==7||month==8) {
            System.out.println("it is Summer!");
        }else if  (month==9||month==10||month==11) {
            System.out.println("it is Fall!");
        }else if  (month==12||month==1||month==2) {
            System.out.println("it is Winter!");
        }else{
            System.out.println("Invalid month");
        }
        /*
        switch(month){
        case:3 case:4 case:5
        System.out.println("Spring");          SAME AS THE TOP ONE!
        break;
         */


        }
}