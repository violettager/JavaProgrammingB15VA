package day28_review;
import java.util.*;
public class ArrayRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];
        for (int i = 0; i <10 ; i++) {
            nums[i] = random.nextInt(101);
            System.out.print( nums[i]+" ");
        }
        System.out.println( );
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums) );

while(true){
        int[] num1 = {random.nextInt(2),
                random.nextInt(2),
                random.nextInt(2),
                random.nextInt(2),
                random.nextInt(2),
                random.nextInt(2),
                random.nextInt(2),
                random.nextInt(2),
                random.nextInt(2),
                random.nextInt(2),
                random.nextInt(2)};

        System.out.println(Arrays.toString(num1));


        
    }
}}
