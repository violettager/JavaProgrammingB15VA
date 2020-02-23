package day06_operators;

public class CentsToDollars {
    public static void main(String[] args){
        int cents = 250;
         int dollars =  cents/100;
        System.out.println(dollars);
        int remainingCents = cents%100;
        System.out.println(remainingCents);
        System.out.println(dollars+" dollars and "+remainingCents+" cents.");
    }
}
