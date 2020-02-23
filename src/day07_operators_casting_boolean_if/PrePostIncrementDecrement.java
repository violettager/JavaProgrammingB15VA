package day07_operators_casting_boolean_if;

public class PrePostIncrementDecrement {
    public static void main(String[] args){
        int num1 = 1;
        int num2 = ++num1;
        System.out.println("Num1: "+num1);//2
        System.out.println("num2: "+num2);//2

        int j1 = 4;
        int j2 = j1++;
        System.out.println("J1: "+j1);//5
        System.out.println("J2: "+j2);//4

    }
}
