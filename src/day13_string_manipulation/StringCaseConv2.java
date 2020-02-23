package day13_string_manipulation;

public class StringCaseConv2 {
    public static void main(String[] args) {
        String word = "Cybertek school";
        System.out.println(word.toUpperCase());

        String uWord = word.toUpperCase();
        System.out.println("uWord = " + uWord);
        System.out.println("word = " + word);
        word = word.toUpperCase();
        System.out.println("word = "+word);
        
        String LWord = word.toLowerCase();
        System.out.println("LWord = " + LWord);


        if(LWord.equals("cybertek school")){
            System.out.println("Lword is all lower case");
        }else{
            System.out.println("Lword does not match");
        }
        
    }
}
