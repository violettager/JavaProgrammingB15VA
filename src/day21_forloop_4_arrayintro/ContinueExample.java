package day21_forloop_4_arrayintro;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if(i>=2&&i<=4){
                System.out.println("Skipping - "+i);
                continue;
            }
            System.out.println("i = " + i);
            
        }
    }
}
