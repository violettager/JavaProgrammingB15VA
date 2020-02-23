package day13_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String company = "Cybertek";
        System.out.println(company.length());
        System.out.println(company.charAt(0));
        System.out.println(company.charAt(1));
        System.out.println(company.charAt(2));
        System.out.println(company.charAt(3));
        System.out.println(company.charAt(4));
        System.out.println(company.charAt(5));
        System.out.println(company.charAt(6));
        System.out.println(company.charAt(7));
       // System.out.println(company.charAt(8)); StringIndexOutOfBoundsException: error

        char first = company.charAt(0);
        System.out.println("first = " + first);

        if(first=='C'){
            System.out.println("first = " + first);
        }else{
            System.out.println("wrong");
        }
        String name = "civic"; //palindrome word,same first letter and the last one
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(4);
        System.out.println((firstLetter==lastLetter)? "first and last letters match":"first and last letters do not match");

        System.out.println(name.charAt(0)+" "+name.charAt(1)+" "+name.charAt(2)+" "+name.charAt(3)+" "+name.charAt(4));











    }
}
