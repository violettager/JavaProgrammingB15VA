package day15_string_manipulation;

public class RemoveThem {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String withNoSpaces = sentence.replace(" ","");
        System.out.println("withNoSpaces = " + withNoSpaces);
        System.out.println("sentence = "+sentence);
        String withoutIs = sentence.replace("is ","");
        System.out.println("withoutIs = " + withoutIs);
        
        String etsyResult = "iphone case (212,713 results)";
        etsyResult = etsyResult.replace("iphone case (","").replace(",","").replace(" results)","");
        System.out.println("etsyResult = " + etsyResult);


    }
}
