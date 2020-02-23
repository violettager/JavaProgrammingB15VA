package day05_practice_scanner_math;
import java.util.Scanner;
public class SalaryCalculation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your hourly rate?");
        double hourlyRate = input.nextDouble();

        double weeklySalary = hourlyRate*40;
        System.out.println("your weekly salary is: "+weeklySalary);

        double monthlySalary = weeklySalary*52/12;
        System.out.println(" your monthly salary: "+monthlySalary);

        double annualSalary = monthlySalary*12;
        System.out.println(" your annual salary: "+annualSalary);






    }
}
