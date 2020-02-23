package day24_arrays03;

public class CopyArray {
    public static void main(String[] args) {
        int[] num1 = {23, 55, 34, 87, 90, 123, 30};
        //declare num2 with same size as num1
        int[] num2 = new int[num1.length];
        System.out.println("num1 length: " + num1.length);
        System.out.println("num2 length: " + num2.length);
        // using for loop read all the values from num1 and assign to num2
        for (int idx = 0; idx < num1.length; idx++) {
            num2[idx] = num1[idx];


        }
        //print values from num1and num2 using for each loop
        for (int nums : num1) {
            System.out.print(nums + " | ");
        }
        System.out.println();
        for (int num : num2) {
            System.out.print(num + " | ");
        }
        int[] num3 = new int[num1.length];
        //assign all values in double in num3
        for (int i = 0; i < num1.length; i++) {
            num3[i] = num1[i] * 2;

        }
        System.out.println();
        for (int n : num3) {
            System.out.print(n+" | ");
        }
    }


}
