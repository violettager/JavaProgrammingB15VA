package day35_wrapper_classes;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println(getGrade(44));
        System.out.println();

    }
    public static char getGrade (int score){
        char grade;
        if(score>=94&&score<=100){
            grade = 'A';
            System.out.println("YOU DID SUCH A GOOD JOB!");
        }else if(score>=80&&score<=93){
            grade =  'B';
            System.out.println("You did good!");
        }else if(score>=50&&score<=79){
            grade = 'C';
            System.out.println("You can do better than that.");
        }else if(score>=30&&score<=49){
            grade = 'D';
            System.out.println("You can try again later!");
        }else if(score>=0&&score<=29){
            grade = 'F';
            System.out.println("Failed.");
        }else {
            System.out.println("Error! not existing score - "+score);
            grade = '0';

        }
        System.out.println("Your grade is ");
        return grade;

    }
}
