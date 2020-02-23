package practice;

public class CountingWordsLetters {
    public static void main(String[] args) {
        String str = "word is the word which we use in java java";

        for (int i = 0; i < str.length()-2; i++) {
            str = str.substring(str.indexOf(i)+3);


        }
    }
}
