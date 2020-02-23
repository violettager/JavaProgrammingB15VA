package day21_forloop_4_arrayintro;

public class NestedLoop1 {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 0; inner < 10; inner++) {
                System.out.print(inner + " ");

            }
            System.out.println("        " + outer);

            //when we write nested loop



        }
        for(int outer = 10; outer>=0;outer--){
            for(int inner = 0;inner <=outer; inner++){
                System.out.print(inner+" ");
            }
            System.out.println();
        }
        for(int outer = 0; outer<=9;outer++){
            for(int inner = 0;inner <=outer; inner++){
                System.out.print(inner+" ");
            }
            System.out.println();
        }
        for(int outer = 10; outer>=0;outer--){
            for(int inner = 0;inner <=outer; inner++){
                System.out.print(inner+" ");
            }
            System.out.println();
        }
        for(int outer = 0; outer<=10;outer++){
            for(int inner = 0;inner <=outer; inner++){
                System.out.print(inner+" ");
            }
            System.out.println();
        }

    }
}
