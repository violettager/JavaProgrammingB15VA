package day47_inheritance02;

public class EmployeesTest {
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee();
        FullTimeEmployee emp = new FullTimeEmployee("Jamil","SDET",5);
        System.out.println(emp.getName());
        System.out.println(emp.getTitle());
        System.out.println(emp.getBonus());



    }
}