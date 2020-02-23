package day16_memory_string_While_loop_intro;

public class MergeWord {
    public static void main(String[] args) {
        String pattern = "<<>>";
        String word = "java";
        String merged = "";

        System.out.println(pattern.substring(0,2)+word+pattern.substring(2,4));
        merged = pattern.substring(0,2)+word+pattern.substring(2,4);
        System.out.println("merged = " + merged);

        






    }
}
