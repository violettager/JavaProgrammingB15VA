package day19_forloop_2;

public class PrintLetters {
    public static void main(String[] args) {
                     //012345678
        String name = "Violetta";
        for (int i = 0; i <name.length()-1; i++) {
            System.out.println(name.charAt(i) + " : " + i);
        }
            System.out.println();
            for (int i=name.length()-1;i>=0; i--){
                System.out.print(i+" "+ name.charAt(i));



        }


    }
}
