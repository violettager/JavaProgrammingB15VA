package day58_exceptions3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatch {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file.csv");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException is caught/handled!");
            //e.printStackTrace();
        }
        System.out.println("after try catch");
        try {
            int[] nums = {23, 12, 54};
            System.out.println(nums[0]);
            System.out.println(nums[2]);
            //if(nums.length>3) {
            System.out.println(nums[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException is caught and handled...");
        }
        System.out.println("After Array");
    }
}
