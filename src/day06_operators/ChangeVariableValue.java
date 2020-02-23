package day06_operators;

public class ChangeVariableValue {
    public static void main(String[] args){
        int students = 50;
        System.out.println("Students: "  +students);
        students = students+10;
        System.out.println("Students: "+students);
        students = students-2;
        System.out.println("Students: "+students);


        int b12Students = 3;
        students = students +b12Students;
        System.out.println("Students: "+students);


        double balance = 250;
        double shoesPrice = 75.5;
        System.out.println("balance: "+balance);
        balance = balance - shoesPrice;


        System.out.println("balance: "+balance);

        double socksPrice = 10.99;
        balance = balance - socksPrice;
        System.out.println("balance: "+balance);

        double shirtPrice = 77*2;
        balance = balance - shirtPrice;
        System.out.println("balance: "+balance);

        double Sandwich = 7.99;
        balance = balance - Sandwich;
        System.out.println("balance: "+balance);







    }
}
