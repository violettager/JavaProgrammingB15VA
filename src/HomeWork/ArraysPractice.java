package HomeWork;
import java.util.*;
public class ArraysPractice {
    public static void main(String[] args) {
        /*
        given an int array
        1 find average between all numbers
        -add all numbers in array
          -loop through array and find the sum
          -divide the sum by the array length
        2.count how many elements in array
        is above or equal to average
        - create int count = 0
        - loop through array and check each element
        if element>=average count++
        3. create new array with all elements that are above or equal to average
        -create empty array with size of count
        -loop through array and check each element
        if that element >= average wi will add it to new array
         */
        int [] num ={12,56,87,34,67,33,10,3};
        int sum = 0;
        for (int i = 0; i <num.length ; i++) {
            sum=sum+num[i];

        }
        System.out.println(sum);
        int average = sum/num.length;
        System.out.println(average);

        int count = 0;
        for (int i = 0; i <num.length ; i++) {
            if(num[i]>=average){
                count++;
            }

        }
        System.out.println(count);

        int [] num2 = new int [3];
        int index = 0;

        //{56,12,56,87,34,67,33,10,3,78}
        //37 average
        for (int i = 0; i <num.length ; i++) {
            if(num[i]>=average){
                num2[index]=num[i];
               index++;
            }

        }
        System.out.println(Arrays.toString(num2));



    }
}
