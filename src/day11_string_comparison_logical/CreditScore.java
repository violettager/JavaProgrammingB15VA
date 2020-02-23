package day11_string_comparison_logical;

public class CreditScore {
    public static void main(String[] args) {
        int score = 777;
         if(score>=750 && score<=850){
            System.out.println( score +" Excellent ");
        }else if(score>=749 && score<=700) {
             System.out.println( score+ " Good" );
         }else if (score>=650 && score<=699) {
             System.out.println( score +" Fair");
         }else if(score>=550 && score<=649) {
             System.out.println(score+" Poor" );
         }else if(score>=0 && score<=550) {
             System.out.println(score+" Bad");
         }else{
             System.out.println("invalid");
         }
    }
}
