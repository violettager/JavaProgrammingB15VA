package day36_wrapper_arraylist;
import java.util.*;
public class ArrayListWriteRead {
    public static void main(String[] args) {
        // declare ArrayList  that can store Integer values.nums
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(34);
        nums.add(50);
        nums.add(12);
        nums.add(10);
        nums.add(76);
        //print the number of values in the arraylist. size() method
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums.toString() = " + nums.toString());
        //print first number.at index 0 get(0)
        System.out.println(nums.get(0));

        //print number at index 2
        System.out.println(nums.get(2));

        int i  = 4;
        //print number at index i
        System.out.println(nums.get(i));
        for (int n = 0; n < nums.size(); n++) {
            System.out.println(nums.get(n));

        }
    }
}
