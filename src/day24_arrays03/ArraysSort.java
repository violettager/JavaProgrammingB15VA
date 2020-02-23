package day24_arrays03;
import java.util.*;
public class ArraysSort {
    public static void main(String[] args) {
        int[]nums= {44,12,5,900,1};
        System.out.println("before sorting");
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);

        System.out.println("After sorting");
        System.out.println(Arrays.toString(nums));

        String[] letters  = {"c","a","w", "y","b","n"};
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));


    }

}
