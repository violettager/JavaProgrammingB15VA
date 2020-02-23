package day56_exceptions;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("before try catch:");
        try {
            int result = 10 / 0;

        }catch(ArithmeticException e){
            System.out.println("Exception happened , and was handled!");
        }
        System.out.println("After try catch");

        try{
            System.out.println("in second try block");
            String str = "java is fun!";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        }catch(Exception e){
            System.out.println("Exception happened in try block and caught!");
        }
        System.out.println("after second try catch");

    }
}
