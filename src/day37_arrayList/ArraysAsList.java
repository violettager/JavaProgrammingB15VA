package day37_arrayList;
import java.util.*;
public class ArraysAsList {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(10, 40, 12, 5, 7);
        System.out.println("nums = " + nums);
        // nums.remove(0);
        // nums.add(2); not resizable, shortcuts comes with a cost
        System.out.println("nums = " + nums);
        List<Integer> nums2 = new ArrayList(Arrays.asList(10, 40, 12, 5, 7));
        System.out.println("nums2 = " + nums2);
        nums2.add(34);
        nums2.add(55);
        System.out.println("nums2 = " + nums2);
        nums2.remove(0);
        System.out.println("nums2 = " + nums2);
    }
}
