package day48_overriding;

public class EmployeePayTest extends Employee{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.calculatePay(40,65);
        FullTimeEmployee f1 = new FullTimeEmployee();
        f1.calculatePay(40,30);
        Contractor c1 = new Contractor();
        c1.calculatePay(40,78);
        System.out.println(e1.toString());
        System.out.println(f1.toString());
        System.out.println(c1.toString());

    }
}
