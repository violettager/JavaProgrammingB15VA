package day22_arrays_intro;

public class ArraysIntro {
    public static void main(String[] args) {
     int [] nums = new int[6];
     nums[0] = 10;
     nums[1] = 20;
     nums[2] = 30;
     nums[3] = 40;
     nums[4] = 50;
        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[3] = "+ nums[3]);
        System.out.println(nums[1]+nums[2]);
         int second  = nums[2];
        System.out.println(second);
        nums[5] = 60;
        System.out.println(nums[5]);
        System.out.println("number of elements - " + nums.length);
           int length = nums.length;
           nums[2] = 53;
           nums[3] = nums[4];
        System.out.println(nums[3]);
             
    }
}
