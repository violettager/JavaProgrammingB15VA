package day21_forloop_4_arrayintro;

public class PrintStarsColRow {
    public static void main(String[] args) {
       int row = 6;
       int colum = 15;

        for (int i = 1; i <row ; i++) {
            for(int col = 1;col<=colum;col++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }

    }
}
