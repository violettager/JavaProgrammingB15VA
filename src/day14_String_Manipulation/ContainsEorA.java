package day14_String_Manipulation;

public class ContainsEorA {
    public static void main(String[] args) {
        String name  = "Pavel";
        if(name.contains("e")||name.contains("a")){
            System.out.println("There is  e or a in Pavel");
        }else{
            System.out.println("there is no e or a in the name");
        }
        String word ="java";
        System.out.println(word.startsWith("j"));
        /*
        if we use (.startsWith) it compares your characters that you give and checks if it starts
        with those characters.
        We have to respect the space because it also counts as a character.
         */

    }
}
