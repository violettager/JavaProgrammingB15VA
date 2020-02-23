package day31_multidArray;

import java.util.Arrays;

public class MultiplicationTable2D {
    public static void main(String[] args) {
        int[][] table = new int[10][10];
        for(int outer = 1;outer<=10;outer++){
            for(int inner= 1; inner<=10;inner++){
                System.out.print(outer*inner+" ");
                table[outer-1][inner-1] = outer*inner;
            }
            System.out.println();

        }
        System.out.println(Arrays.deepToString(table));
        System.out.println();

        for(int []row : table){
            for(int col:row){
                System.out.print(col+"\t");
            }
            System.out.println();

        }
    }
}
