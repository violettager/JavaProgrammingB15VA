package practice;

public class StringLoops {

    public static void main(String[] args) {

        String str = " java java I love java java java is life java  java is the best";

        System.out.println(str.charAt(5)); //takes the number of index (int) and gives you a char( letter)

        char letter = str.charAt(8);
        System.out.println(str.indexOf("fe jav")); //it takes a char(letter) (string) and it gives you index of a letter 9 int)
        int indesx = str.indexOf("fe jav");
        System.out.println(str.charAt(str.indexOf("is")));

        System.out.println(str.substring(2, 6));
        int start = str.indexOf("life");
        int end = str.indexOf(" java is th");

        System.out.println(str.substring(start, end));

            int count = 0;
        for (int i = 0; i < str.length()-3; i++) {

            if(str.substring( i , i+4).equals("java") ){
                count++;


            }



        }
        System.out.println("there are "+ count + " java");


    }
}
