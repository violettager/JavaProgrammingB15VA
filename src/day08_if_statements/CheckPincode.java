package day08_if_statements;

public class CheckPincode {
    public static void main(String[] args) {
        int secretPincode = 6742;
        int userEnterPincode = 6742;

        if(secretPincode==userEnterPincode){
        System.out.println("Welcome to your account!");

    }else{
        System.out.println("invalid pincode!\n Access denied!");
    }

        System.out.println("Thank for your business ");//this is outside the curly braces and it will run anyways!
} }
