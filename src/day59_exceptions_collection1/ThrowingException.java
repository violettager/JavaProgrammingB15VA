package day59_exceptions_collection1;

import java.io.IOException;
import java.lang.invoke.SwitchPoint;

public class ThrowingException {
    public static void main(String[] args) {
        //create object of arithmetic exception
        ArithmeticException ar = new ArithmeticException();
        RuntimeException ar2 = new ArithmeticException("cannot / by 0");
        System.out.println(ar.getMessage());
        System.out.println(ar2.getMessage());
        // throw ar;
        String userName = "user123";
        if (userName.isEmpty()) {
            //  RuntimeException r= new RuntimeException("Username cannot be empty");
            // throw r; another way
            throw new RuntimeException("Username cannot be empty");
        } else {
            System.out.println("Username is valid ");
        }
        int age = 43;
        if (age > 18) {
            System.out.println("Elligible to vote");
        } else {
            // thrown to indicate tht a method has been passed an illegal or inappropriate argument.
            throw new IllegalArgumentException("Age cannot be less than 18, illegible to code ");
        }
        int month = 2;
        if(month>=1 && month<13){
            System.out.println("Valid month - "+ month);
        } else{
            throw new RuntimeException("Invalid month - "+ month);
        }
        int [] nums= {44,55,11};
        int index = 1;
        if(nums.length <=index || index<0 ){
            throw new ArrayIndexOutOfBoundsException("Invalid index "+ index);
        } else{
            System.out.println("index "+ index +", value "+ nums[index]);
        }
        String firstName= "Nadir";
        if(firstName== null){
            throw new NullPointerException("firstname cannot be null");
        }
        for (int i = 0; i < firstName.length(); i++) {
            System.out.println(firstName.charAt(i));
        }
        System.out.println(getWeekDayName(6));
        System.out.println(getWeekDayName(5));
        try{
            System.out.println(getWeekDayName(8));
        } catch(IllegalArgumentException e){
            System.out.println("IllegalArgument Exception was handled ");
            System.out.println(e.getMessage());
            System.out.println(getWeekDayName(1));
        } try{
            throw new IOException("IOException");
        } catch (Exception e){
            System.out.println("Exception is caught");
            System.out.println(e.getMessage());
        }
    }
    public static String getWeekDayName(int day){
        String ans= "";
        switch(day){
            case 1: ans="Monday"; break;
            case 2: ans+="Tuesday"; break;
            case 3: ans+="Wednesday"; break;
            case 4: ans+="Thursday"; break;
            case 5: ans+="Friday";break;
            case 6: ans+="Saturday";break;
            case 7: ans+="Sunday"; break;
            default: throw new IllegalArgumentException("Invalid data, enter valid data from day 1 to 7");
           /*
           or public static String getWeekDayName(int day){
        if(day<1 || day>7){
            throw new IllegalArgumentException("Invalid data, enter valid data from day 1 to 7");
            */
        }
        return ans;
    }
}
