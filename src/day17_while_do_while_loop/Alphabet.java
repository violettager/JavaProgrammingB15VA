package day17_while_do_while_loop;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';
        while(letter<='z'){
            System.out.print(letter);
            letter++;

        }
        System.out.println();
         char letter2 = 'z';
        while(letter2>='a'){
            System.out.print(letter2+" ");
            letter2--;

        }
        System.out.println();
        String letters = "";
        char l  = 'A';
        letters+=l;
        l = 'b';
        letters+=l;
        System.out.println("letters = "+letters);// because you need to use the println method for the correct output which is the triangle formation of your answer


        char myLetter = 'a';
        String alphabet = "";
        while(myLetter<='z'){
            alphabet+= myLetter; //alphabet = alphabet+myLetter;
            myLetter++;
            System.out.println(alphabet+" ");




        }





    }
}
