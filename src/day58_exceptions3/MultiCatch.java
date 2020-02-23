package day58_exceptions3;

import java.util.*;

public class MultiCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value: ");
        String str = scan.next();
        try {
            System.out.println("In try block...");
            int num = Integer.parseInt(str.substring(0, 3));
            System.out.println("num = " + num);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught...");
            System.out.println("message: " + e.getMessage());
            System.exit(1);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught...");
            System.out.println("Message: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught...");
            System.out.println("message: " + e.getMessage());
        } finally {
            System.out.println("Finally Block: always runs");
        }
        System.out.println("After multi catch blocks...");
    }
}
