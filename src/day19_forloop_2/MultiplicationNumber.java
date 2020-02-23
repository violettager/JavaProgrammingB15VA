package day19_forloop_2;

public class MultiplicationNumber {
    public static void main(String[] args) {
        System.out.println("MULTIPLICATION :");
        int number = 4;
        if(number < 1 ||number>10){
            System.out.println("ERROR: Invalid input");
            return; //System.exit(0);  SAME THING
        }
        for(int n  = 1; n<=10;n++){
            int result = n*number;
            System.out.println(n+" x "+number+" = "+result);
        }

        }
    }

