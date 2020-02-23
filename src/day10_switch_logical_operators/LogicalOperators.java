package day10_switch_logical_operators;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LogicalOperators {
    public static void main(String[] args) {
        int apples = 10;
        int oranges = 20;
        System.out.println("### TRUTH TABLE FOR $$ OPERATOR ###");
        System.out.println("true $$ True is"+(true && true) );
        if (apples ==10 && oranges ==20){
            System.out.println("condition was true");

        }else{
            System.out.println("condition was false");
        }
        System.out.println("true $$ True is "+(false && true) );
    }
}
