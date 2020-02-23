package day57_exceptions2;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Checked Exception in next line");
        try {
            Thread.sleep(1000); // it pause code execution for given milliseconds. this line
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After Thread.sleep");
    }
}
