package day10_switch_logical_operators;

public class GradeChecker {
    public static void main(String[] args) {
        char grade = 'd';

        switch(grade){
            case'A':
                System.out.println("exelent!");
              break;
            case'B':
                System.out.println("Good");
                break;
            case'C':
                System.out.println("fair");
                break;
            case'D':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Unknown grade value - "+grade);
        }
    }
}
