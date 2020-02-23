package day32_costommethods;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayMessage("Java is fun!");
        displayMessage("Coding Java today!");
        greetByName("Violetta");
        count(10);
    }
    public static void displayMessage(String message) {
        System.out.println("message: "+ message);

    }
    public static void greetByName(String name){
        System.out.println("Hello "+name+", how are you?");

    }
    public static void count(int num){
        for (int i = 0; i <= num; i++) {
            System.out.print(i+" ");

        }
        System.out.println();

    }

}
