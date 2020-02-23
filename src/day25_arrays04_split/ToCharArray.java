package day25_arrays04_split;
import java.util.*;
public class ToCharArray {
    public static void main(String[] args) {
        String word = "java";
        char[] letters  = word.toCharArray();
        System.out.println("Letters length--> "+letters.length);
        for(char l : letters){
            System.out.print(l+" - ");
        }
        System.out.println();
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));
        String str = "shdlkfjqhweaofuqyvwudbqkjslndvwfdkjh";
        char[] strArr = str.toCharArray();
        Arrays.sort(strArr);
        String sorted = new String(strArr);
        System.out.println("str = "+str);
        System.out.println("sorted = "+sorted);


    }
}
