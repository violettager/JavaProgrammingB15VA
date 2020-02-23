package day16_memory_string_While_loop_intro;

public class PrintLast {
    public static void main(String[] args) {
        String  word  = "hello";
        System.out.println(word.length());
        System.out.println(word.length()-1);

        int count = word.length();
        System.out.println(word.charAt(count -1));

        String word1  = "Hello World";
        System.out.println(word1.charAt(word1.length()-1));
        System.out.println(word1.indexOf(word1.length()-1));

    }
}
