package day11_string_comparison_logical;

public class StringEquals {
    public static void main(String[] args) {
        String str = "java";
        String str2 = new String("java");
        System.out.println(str=="java");// compare using ==
        System.out.println(str=="java");// not working (have to use .equals)


        // compare using.equals() method
        System.out.println(str.equals("java"));//true
        System.out.println(str2.equals("java"));//true
        System.out.println(str.equals("Java"));// false J are different
        System.out.println(str2.equalsIgnoreCase("JaVa"));//true because of ingore case


        System.out.println(str.equalsIgnoreCase(str2)); //true
    }
}
