package day08_if_statements;

public class ExamResult {
    public static void main(String[] args) {
        int score = 80;

        if(score>=60){
            System.out.println("Congradulation, you passed the test!");
        }else{
            System.out.println("You failed. \n Please study more and try again!");
        }
    }
}
