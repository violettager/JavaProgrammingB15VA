package day23_arraysday2;

import java.util.*;

public class ArrayWithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 score values: ");
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("enter team " + (i + 1) + " score: ");
            scores[i] = scan.nextInt();


        }
        for (int score : scores) {
            System.out.print(" | " + score);
        }
        int max = 0;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]>max){
                max = scores[i];
            }



        }
        System.out.println();
        System.out.println("max = "+max);

    }

//find average score add them all then divide by 5

}





