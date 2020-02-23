package day35_wrapper_classes;

public class Recursion {
    public static void main(String[] args) {
       // printNum(5);
        printNumGood(5);
    }

   public static void printNum(int num) {
       System.out.println(num);
       printNum(num);

   }

    public static void printNumGood(int num) {
        if (num >= 0) {
            System.out.println(num);
            printNumGood(num -1);

        } else {
            return;
        }
    }
}