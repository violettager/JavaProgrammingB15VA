package day13_string_manipulation;

public class StringLength {
    public static void main(String[] args) {
        String school = "Cybertek School";
        System.out.println(school.length());

        int count = school.length();
        System.out.println("count = " + count);
        System.out.println(school+" has "+count+" characters");

        String FirstName = "Violetta";
        String LastName = "Gerasimchuk";

        int FullNameCount = FirstName.length()+LastName.length();
        System.out.println("full name has: "+FullNameCount+" characters");

        String password = "cybertek123";


        if (password.length()>=5 && password.length()<=20){
            System.out.println("good password");
        }else{
            System.out.println("try again");


        }







    }
}
