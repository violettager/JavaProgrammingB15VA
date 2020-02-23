package day58_exceptions3;

public class TryWithFinally {
    public static void main(String[] args) {
     // don't try it in real coding where they pay you
        try{
            System.out.println("in try block...");
            System.out.println(9/3);
        }finally{
            System.out.println("in finally block... runs always");
        }
        System.out.println("After try finally...");
    }
}
