package day16_memory_string_While_loop_intro;

public class StringPractice {
    public static void main(String[] args) {
        String word  = "jav";
        String reversed = "";

        System.out.println(word.charAt(2));
        reversed = reversed + word.charAt(2)+word.charAt(1)+word.charAt(0);
        System.out.println("reversed = " + reversed);



    }
}
