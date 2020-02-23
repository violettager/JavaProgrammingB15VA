package day54_polymorphism;

public class FinalizeTestWithDiamond {
    public static void main(String[] args) {
        int num = 0;
       // while (num == 0) {   infinite loop
            Diamond d1 = new Diamond();
            Diamond d2 = new Diamond();
            Diamond d3 = new Diamond();

            d1 = null;
            d2 = null;
            d3 = null;
            System.gc(); //invite/ suggest
        }
    }
