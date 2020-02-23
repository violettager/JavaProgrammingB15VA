package day17_while_do_while_loop;
import java.util.Scanner;
public class FlipFlopScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name");
        String word = scan.nextLine();
        word = (word.toUpperCase());
        System.out.println(word.indexOf(" "));
        int spaceIdx = word.indexOf(" ");
        System.out.println(word.substring(0,spaceIdx));
        System.out.println(word.substring(spaceIdx+1));
        String word1 = word.substring(0,spaceIdx);
        String word2 = word.substring(spaceIdx+1);
        System.out.println(word2+" "+word1);
    }
}
