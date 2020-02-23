package day32_costommethods;

public class VoidMethods {
    public static void main(String[] args) {
        countFrom1to10();
        printAtoZ();
        iCanDoIt();
        displayUSFlag();


    }

    public static void countFrom1to10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");

        }
    }

    public static void printAtoZ() {
        System.out.println();
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
        }
        public static void iCanDoIt(){
            System.out.println();
            for (int i = 1; i <=300 ; i++) {
                System.out.print("Java is Fun - I can do it!  | \t");

            }
        }
        public static void displayUSFlag(){
            System.out.println();
            String p1 = "\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 ===========================================================================\n \u2605 \u2605 \u2605 \u2605 \u2605 \u2605 ==========================================================================";
            String p2 = "===========================================================================================";
            for (int i = 0; i < 4; i++) {
                System.out.println(p1);
            }
            System.out.println("\u2605 \u2605 \u2605 \u2605 \u2605 \u2605 ===========================================================================");
            for (int i = 0; i < 6; i++) {
                System.out.println(p2);
            }
        }

    }

