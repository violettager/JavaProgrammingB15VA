package b15officeHoursWithVasil;

import java.util.Arrays;

public class Users {
    public static void main(String[] args) {
        String[] users = {"1, John, 25, 312-674-3925",
                          "2, Kevin, 34, 413-564-0926",
                          "3, Paul, 50, 509-500-0930",
                          "4, Mark, 42, 565-568-0002",
                          "5, Trevor, 18, 877-564-2922"
                           };
        String user1 = users[0];
        System.out.println("user1 = " + user1);
        String[] userArray = users[0].split(", ");
        System.out.println(Arrays.toString(userArray));
        String user1PhoneNumber = userArray[3];
        System.out.println("user1PhoneNumber = " + user1PhoneNumber);
        for(String user:users){
            String name = user.split(", ")[1];
            System.out.println("name = " + name);
        }
        int oldest = 0;
        String nameOfOldest = "";
        for(String user:users){
            //will convert String to integer 
            int age = Integer.parseInt(user.split(", ")[2]);
            if (age>oldest){
                oldest = age;
                nameOfOldest = user.split(", ")[1];

            }
            
        }
        System.out.println("oldest = " + oldest);
        System.out.println("oldest = " +nameOfOldest+" and his age is - "+oldest);

    }
}
