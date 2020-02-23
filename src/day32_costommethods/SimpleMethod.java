package day32_costommethods;

public class SimpleMethod {
    public static void main(String[] args) {
        displayMessage(); //call/use the custom method
        displayMessage(); //call/use the custom method
    }
    public static void displayMessage(){
        System.out.println("Hello world from my method!");
    }
}
