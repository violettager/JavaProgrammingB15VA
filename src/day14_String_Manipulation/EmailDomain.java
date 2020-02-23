package day14_String_Manipulation;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "employee@gmail.com";

        if (email.contains("al")) {
            System.out.println("google account");
            if (email.contains("@yahoo")) {
                System.out.println("yahoo account");
                if (email.contains("@hotmail")) {
                    System.out.println("Hotmail account");
                    if (email.contains("@icloud")) {
                        System.out.println("Apple account");
                       }else{
                        System.out.println("some other account");
                    }
                }
            }
        }
    }
}
