package day22_arrays_intro;

public class ArraysWithNumbers {
    public static void main(String[] args) {
        int[] numsArray = new int [4];
        numsArray[0] = 1;
        numsArray[1] = 2;
        numsArray[2] = 3;
        numsArray[3] = numsArray[1] +numsArray[2];
                          //0   1  2  3  4  5  6
        int [] numsArray2 = {12,34,67,44,33,2,78};
        System.out.println(numsArray2[3]);

        int[] numsArray3 = new int[]{12,3,3,56,563,23,21,43};

        int number = 10;
        int number2 = 11;
        int number3 = 12;
        int [] numsArray4 = {number,number2,number3, 76, 67};
        System.out.println(numsArray4[2]+ number);
        System.out.println("numsAray length - "+numsArray.length);
        System.out.println("numsAray2 length - "+numsArray2.length);
        System.out.println("numsAray3 length - "+numsArray3.length);
        System.out.println("numsAray4 length - "+numsArray4.length);
        System.out.println(numsArray[3]);
        int violetta = 3;
        System.out.println(numsArray[violetta]+"+");
        int length = numsArray4.length;
        System.out.println(length);
        System.out.println(numsArray4[length-1]);
        System.out.println(numsArray[numsArray.length-1]);

        for (int i = 0; i <numsArray4.length; i++) {
            System.out.print(numsArray4[i]+" | ");

        }
        System.out.println();
        for (int i = 0; i <numsArray4.length ; i++) {
            if(numsArray4[i]>=12){
                System.out.print(numsArray4[i]+" | ");

            }

        }
    }
}
