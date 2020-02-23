package day05_practice_scanner_math;

import java.util.Scanner;
public class ScannerSpeedCheck {
    public static void main(String[] args){
        //create scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to SpeedCheck Program.");
        System.out.println("Enter your current speed: ");
        int currentSpeed =input.nextInt();
       // System.out.println("current speed: "+ currentSpeed);
        int speedLimit = 55;
        int overTheLimit = currentSpeed -speedLimit;
        System.out.println("you are driving "+overTheLimit+" mph over the limit!");





    }
}
