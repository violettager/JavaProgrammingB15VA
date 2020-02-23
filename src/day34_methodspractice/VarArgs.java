package day34_methodspractice;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        sum(20);
        sum(23, 43);
        sum(23, 67, 42, 78, 87, 945);
        sum();

    }


    public static void sum(int... nums) {
        //System.out.println("index 0: "+nums[0]);
        System.out.println(Arrays.toString(nums));
    }
}

