package day04_math_operators_scanner;

import java.util.Scanner;

public class WhatIsYourNameScanner {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = input.next();
        System.out.println("great, "+name);


    }
}
