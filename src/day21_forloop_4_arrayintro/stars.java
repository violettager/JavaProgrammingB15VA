package day21_forloop_4_arrayintro;

public class stars {
    public static void main(String[] args) {


        for (int outer = 0; outer <= 15; outer++) {
            for (int inner = 0; inner <= outer; inner++) {
                System.out.print("\u2605 ");
            }
            System.out.println();
        }
        for(int outer = 14;outer>=0;outer--){
            for(int inner = 0;inner<=outer;inner++){
                System.out.print("\u2605 ");
            }
            System.out.println( );

        }
    }
}
