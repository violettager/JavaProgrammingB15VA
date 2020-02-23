package day32_costommethods;

public class VotingCheck {
    public static void main(String[] args) {
        checkIfCanVote(17);
        printAge(1981);

    }
    public static void checkIfCanVote(int age){
        if(age>=18){
            System.out.println(age+" |  You are eligible to vote!");
        }else{
            System.out.println(age+" |  You are not eligible to vote!");
        }

    }
    public static void printAge(int birthYear){
       int age = 2019-birthYear;
       System.out.println("birth year is: "+birthYear+" and age is - "+ age);
       }

    }



