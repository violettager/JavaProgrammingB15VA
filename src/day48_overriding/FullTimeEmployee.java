package day48_overriding;

public class FullTimeEmployee extends Employee{
    public void calculatePay(int hours, double rate){
        System.out.println("Fulltime Employee total pay weekly: "+(hours*rate*1.05));
    }

    @Override
    public String toString() {
        return"FullTimeEmployee toString() | "+super.toString();
    }
}
