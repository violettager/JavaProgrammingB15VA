package day20_forloop_3;

public class IndexOf {
    public static void main(String[] args) {
        String word = "Java is fun";
        char letter = 'a';
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
           // System.out.println(word.charAt(i));
            if(word.charAt(i)==letter){
                index = i;
               // break; //exit the loop here. no need to read other chars
                System.out.println(letter+" found at "+i);
            }
        }
        System.out.println(letter+" was found at index # "+index);


    }
}
