package day48_overriding;

public class Contractor extends Employee {
    public void calculatePay(int hours, double rate){
        System.out.println("Contractor total pay weekly: "+(hours*rate)+200);
    }
    public String toString() {
        return"Contractor toString() | "+super.toString();
    }
}
