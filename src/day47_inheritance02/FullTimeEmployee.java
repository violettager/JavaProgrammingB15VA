package day47_inheritance02;

public class FullTimeEmployee extends Employee{
    private double bonus;

    public FullTimeEmployee(String name, String title, double bonus) {
        super(name, title);
        this.bonus = bonus;
    }

    public FullTimeEmployee(){
        super(); // if we dont add super, compiler will add
        System.out.println("EMPLOYEE NO-ARGS CONSTUCTOR");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
