package day34_methodspractice;

public class StringActions {
    public static void main(String[] args) {
       int num =  countWords("today is a good day ");
        System.out.println("num = " + num);
        System.out.println(countWords("hello my name is Violetta Gerasimchuk!"));
        System.out.println(countChars("java",'a'));
    }
    public static int countWords(String sentence){
        if(sentence.isEmpty()){
            return 0;

        }
        String[] array = sentence.split(" ");
        return array.length;
    }
    public static int countChars(String str,char ch){
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==ch) {
                count++;
            }


        }
        return count;



    }
}
