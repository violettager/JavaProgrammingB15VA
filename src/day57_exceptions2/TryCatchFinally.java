package day57_exceptions2;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Before try catch");
        try{
            System.out.println("hello from try block");
            String str = null;
            System.out.println(str.length());
        }catch (Exception e){ //otherwise NullPointerException
            System.out.println("Exception happened and caught!");
        }finally {
            System.out.println("finally block runs even if there is exception or no exception ");
        }
        System.out.println("After try catch");
    }
    }

