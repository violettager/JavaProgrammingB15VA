package day16_memory_string_While_loop_intro;

public class StartEnd {
    public static void main(String[] args) {
        String str  = "i love [java] programming for living";
        //system.out.println(str.substring(8,12));
        int start = str.indexOf("[");
        int end = str.indexOf("]");
        System.out.println(str.substring(start+1,end));
        //indexOf - is always a number. it accepts characters and gives back a number.
        //charAt- is a letter. it accepts numbers and gives back a letter.
    }
}
