package day25_arrays04_split;
import java.util.*;
public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        // find out how many words in the sentence and split.
        String []wordsArray = sentence.split(" ");
        System.out.println("there are - "+wordsArray.length+" words in the sentence");
        for (int j = wordsArray.length-1 ;j>=0; j--) { //REVERSED!!!!!!!!!!!
            System.out.print(wordsArray[j]+" ");

        }
        System.out.println();
        for(int i  = 0;i<wordsArray.length;i++){  //SAME THING AS BELOW
            System.out.print(wordsArray[i]+" ");
        }
        System.out.println();
        for(String eachWord : wordsArray){
            System.out.print(eachWord+" ");
        }


    }
}
