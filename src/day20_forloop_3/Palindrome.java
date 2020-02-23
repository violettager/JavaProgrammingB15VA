package day20_forloop_3;

public class Palindrome {
    public static void main(String[] args) {
        String word = "Java code";
        word = word.toLowerCase();
        System.out.println(word);
        word = word.replace(" ","");
        System.out.println(word);
        String reversed = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.charAt(i));
            reversed +=word.charAt(i);

        }
        System.out.println("\nreversed = "+reversed);
        if(word.equals(reversed)){
            System.out.println(word+" is palindrome");
        }
        System.out.println(word+" is not palindrome");

    }
}
