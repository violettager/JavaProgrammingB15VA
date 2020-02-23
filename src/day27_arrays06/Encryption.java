package day27_arrays06;

public class Encryption {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz ";
        String encrypted ="zyxwvutsrqponmlkjihgfedcba ";
        String letter = "h";
        int number = alphabet.indexOf(letter);
        System.out.println(encrypted.charAt(number));
        System.out.println(letter+" -> "+encrypted.charAt(number));

        String word = "java";
        String encWord ="";
        int letter1 = alphabet.indexOf("j");
        int letter2 = alphabet.indexOf("a");
        int letter3 = alphabet.indexOf("v");
        int letter4 = alphabet.indexOf("a");
        encWord= encrypted.charAt(letter1)+""+encrypted.charAt(letter2)+encrypted.charAt(letter3)+encrypted.charAt(letter4);
        System.out.println("encWord = " + encWord);


        char first  = word.charAt(0);//j
        char second = word.charAt(1);//a
        char third  = word.charAt(2);//v
        char fourth = word.charAt(3);//a
        int i1 = alphabet.indexOf(first);//9
        int i2 = alphabet.indexOf(second);//0
        int i3 = alphabet.indexOf(third); //21
        int i4 = alphabet.indexOf(fourth);//0
        char encr1 = encrypted.charAt(i1);//q
        char encr2 = encrypted.charAt(i2);//z
        char encr3 = encrypted.charAt(i3);//e
        char encr4 = encrypted.charAt(i4);//z
        encWord = ""+encr1+encr2+encr3+encr4;
        System.out.println("word = " + word);
        System.out.println("encWord = " + encWord);

        String word1 = "tahmina have a nice day";
        String encryptedWord = "";
        int letters= 0;
        for (int i = 0; i < word1.length() ; i++) {
          letters = alphabet.indexOf(word1.charAt(i));
          encryptedWord += encrypted.charAt(letters);

        }
        System.out.println("encryptedWord = " + encryptedWord);

        String word3 = "erlovggz";
        String decrypted = "";
        for (int i = 0; i <word3.length() ; i++) {
            int oposite = alphabet.indexOf(word3.charAt(i));
            decrypted+=encrypted.charAt(oposite);

        }
        System.out.println("decrypted = " + decrypted);


    }
}
