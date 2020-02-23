package day56_exceptions;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Hello b15 online friends!");
       // int num = 2.5; COMPILE ERROR
        int [] nums = new int[3]; //0,1,2
        nums[0] = 55;
        nums[1] = 56;
        nums[2] = 100;
       // nums[3] = 200;         ArrayIndexOutOfBoundsException
       // System.out.println(" bye bye b15 Online Friends");       this line never runs
        int result = 10 /0; // ArithmeticException:
        System.out.println("result is : "+result);

    }
}
