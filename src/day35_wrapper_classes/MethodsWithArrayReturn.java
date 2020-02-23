package day35_wrapper_classes;

import java.util.Arrays;

public class MethodsWithArrayReturn {
    public static void main(String[] args) {

       String[]strArr = getDays();
        System.out.println(Arrays.toString(strArr));
        for(String each:getDays()){
            System.out.println("each = " + each);
        }

    }
    public static String[] getDays(){
        String[] days = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        return days;
    }

}
