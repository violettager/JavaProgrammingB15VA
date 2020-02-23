package day14_String_Manipulation;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word ="java";
        System.out.println(word.startsWith("j"));//true
        System.out.println(word.startsWith("ja"));//true
        System.out.println(word.startsWith("jav"));//true
        System.out.println(word.startsWith("ava")); //false
        System.out.println(word.startsWith("a")); //false
        /*
        if we use (.startsWith) it compares your characters that you give and checks if it starts
        with those characters.
        We have to respect the space because it also counts as a character.
         */

        String schoolName = "cybertek";
        System.out.println(schoolName.endsWith("cy"));//false
        System.out.println(schoolName.endsWith("tek"));//true
        System.out.println(schoolName.endsWith("k"));//true
        System.out.println(schoolName.endsWith("te"));//false
        System.out.println(schoolName.endsWith("tek "));//false (it counts the space)

        /*
        same as (.startsWith)--------(.endsWith) kinda works the same way but opposite "from right to left".
         */
        String name = "Mr. Omer";
       if(name.startsWith("Mr.")){
           System.out.println("man");
       }else if(name.startsWith("Mrs.")){
           System.out.println("Married woman");
       }else if(name.startsWith("Ms")){
           System.out.println("single woman");
       }else if(name.startsWith("Dr.")){
           System.out.println("doctor");
       }else if(name.startsWith("prof.")){
           System.out.println("professor");


       }

       String website = "www.google.com";
       if(website.endsWith(".com")){
           System.out.println("english site");
       }else if(website.endsWith(".edu")){
           System.out.println("college site");
       }else if(website.endsWith(".gov")){
           System.out.println("government site");
       }
    }
}
