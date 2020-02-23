package b15officeHourswithMira;

public class ArrayPractice {
    public static void main(String[] args) {
        /*
        given an int array
        1. find average between all numbers
           - add all numbers in array
           -loop through array and find the sum
           -divide the sum by the array length 
        2. count how many elements in array is above or equal to average
           -create int count = 0
           - loop through the array and check each element
             if element>=average count++
        3. create new array with all elements that are above of equal to average
           - create empty array with size of count 
           - loop through array and check each element 
             if element >= average we will add it to new array 
         */
        int [ ] arr  = {20,0,-5,20,1,12,30,8,9};
        int sum = 0;

        for (int eachArr:arr) {
            sum+=eachArr;
            
            
        }
        int average  = sum/arr.length;
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>=average){
                count++;
            }

        }
        int [] nums = new int[count]; // will create an array with the size of count


    }
}
