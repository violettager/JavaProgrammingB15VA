package day36_wrapper_arraylist;

public class CharacterWrapper {
    public static void main(String[] args) {
        char ch1='a';
        System.out.println(Character.isLetter(ch1));//true
        System.out.println(Character.isDigit(ch1));//false
        System.out.println(Character.isLowerCase(ch1));//true
        System.out.println(Character.isUpperCase(ch1));//false
        char ch2= '5';
        System.out.println(Character.isDigit(ch2));//true
        System.out.println(Character.isLetterOrDigit(ch2)); //true
        System.out.println(Character.isLetter(ch2));//false
        char ch3= '%';
        System.out.println(Character.isDigit(ch3));//false
        System.out.println(Character.isLetter(ch3));//false
        System.out.println(Character.isLetterOrDigit(ch3));//false
        System.out.println(!Character.isLetterOrDigit(ch3));//true ! means not
        char ch4= ' ';
        System.out.println(Character.isWhitespace(ch4));//true  finding space
        System.out.println(Character.isSpaceChar(ch4));//true

        String firstName = "John";
        //test if firstName starts with uppercase letter
        if(Character.isUpperCase(firstName.charAt(0))){
            System.out.println("PASS: first name starts with upper case");
        }else{
            System.out.println("FAIL: first name does not start with upper case");
        }
    }
}
