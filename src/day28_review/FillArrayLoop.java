package day28_review;

import java.util.Arrays;

public class FillArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[101];
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            numbers[i] = i;


        }
        System.out.println(Arrays.toString(numbers));

        for (int i = numbers.length-1; i >=0 ; i--) {

            System.out.print(numbers[i]+" ");


        }
        System.out.println();
        System.out.println(Arrays.toString(numbers));



    }
}

