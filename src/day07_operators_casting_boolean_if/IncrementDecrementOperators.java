package day07_operators_casting_boolean_if;

public class IncrementDecrementOperators {
    public static void main(String[] args){
        int myNumber = 100;
        System.out.println("my number: "+ myNumber);

        myNumber++;
        System.out.println("my number: "+ myNumber);
        ++myNumber;
        System.out.println("my number: "+ myNumber);
        myNumber++;myNumber++;myNumber++;
        System.out.println("my number: "+ myNumber);

        ++myNumber;
        myNumber++;
        ++myNumber;
        System.out.println("my number: "+ myNumber);

        int booksToRead = 5;
        System.out.println("Books to read: "+ booksToRead);
        booksToRead--;
        System.out.println("Books to read: "+ booksToRead);
        booksToRead--;
        --booksToRead;
        System.out.println("Books to read: "+ booksToRead);
        --booksToRead;
        --booksToRead;

        char letter = 'a';
        System.out.println(letter);
        ++letter;
        System.out.println(letter);

        System.out.println("###################################");
        int n1 = 3;
        int n2 = n1++;
        System.out.println(n1);
        System.out.println(n2);


    }

}
