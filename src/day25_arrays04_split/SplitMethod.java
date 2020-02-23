package day25_arrays04_split;
import java.util .*;
public class SplitMethod {
    public static void main(String[] args) {
        String words = "java,ruby,python,c++";
        //split the words by ","and assign to String[]
        String[] wordsArray = words.split(",");
        System.out.println(wordsArray.length);//4
        System.out.println(wordsArray[0]);//java
        System.out.println(wordsArray[1]);//ruby
        System.out.println(wordsArray[2]);//python
        System.out.println(wordsArray[3]);//c++
        System.out.println(Arrays.toString(wordsArray));

        String results = "About 117,000,000 results (1.33 seconds)";
        String[]googleArray = results.split(" ");
        //using for each loop print everything in separate lines
        for(String eachGoogle:googleArray){
            System.out.println(eachGoogle);
        }
        System.out.println("search result count: "+googleArray[4] );



    }
}
