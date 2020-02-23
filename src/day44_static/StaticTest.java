package day44_static;

public class StaticTest {
    public static void main(String[] args) {
        StaticVariables obj = new StaticVariables();
        System.out.println(obj.name);
        System.out.println(StaticVariables.age);
        System.out.println(StaticVariables.price);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        Calculator calc = new Calculator();
        System.out.println(calc.plus(7,6));//plus is instance method
        System.out.println(Calculator.minus(10, 8));
        System.out.println(Calculator.divide(50, 2));
        int result= Calculator.divide(10, 2); //divide is static method
        System.out.println("result = " + result);
        System.out.println(Math.abs(11));
        System.out.println(Math.abs(-8));
        System.out.println(Math.max(100,500));
        System.out.println(Math.cos(45));
        System.out.println(Math.round(85.50));
        //Math m = new Math(); does not compile




    }
}
