package b15officeHourswithMira;
import java.util.Scanner;
public class StringManipulations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word 1");
        String word = scan.next();
        System.out.println("Enter word 2");
        String word2 = scan.next();

        int w1length = word.length();
        if(w1length>5){
            char char4 = word.charAt(4);
            word = word.replace(char4,'*');
            System.out.println("word = " + word);
            word = word.substring(0,4)+"*"+word2;
            System.out.println("word = "+word);

        }else{



        }
    }

}
