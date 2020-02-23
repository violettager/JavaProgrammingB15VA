package day37_arrayList;
import java.util.*;
public class RemoveInteger {
    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(2);
        nums.add(9);
        nums.add(3);
        nums.add(10);
        nums.add(11);
        nums.add(7);
        nums.add(7);
        System.out.println("nums count"+nums.size());
        System.out.println("nums = " + nums);
        //remove number from index 0 
        
        nums.remove(0);
        System.out.println("nums = " + nums);
        
        //remove value - 2. and print again
        nums.remove(2);
        System.out.println("nums = " + nums);
        nums.remove(Integer.valueOf(2));

        // how do you create an Integer wrapper object with value 11
        System.out.println("nums = " + nums);
    }
}
