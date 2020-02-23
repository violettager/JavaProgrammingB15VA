package day22_arrays_intro;

public class FindNOnDuplicates {
    public static void main(String[] args) {
        String str = "abbccdeef";

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            System.out.println("checking = " + letter);

            for (int j = 0; j < str.length(); j++) {
                System.out.println("comparing inner loop letter " + str.charAt(j));


                if (str.charAt(j) == letter && i != j) {
                    System.out.println(letter + " has a duplicate");


                }


            }

        }
    }
}
