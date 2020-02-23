package day32_costommethods;

public class AboutMe {
    public static void main(String[] args) {
        /*
   1. create a custom method: myName
    This method will print message:
    "Hello My name is Bob"
    2. create a custom method: morning
    -> I wake up at 7 am
    -> I have my breakfast
    -> Goto School
   3. Create a custom method: code
   This method prints below:
    I code java
    Java is fun         */
        myName();
        morning();
        code();

    }

    public static void myName() {
        System.out.println("Hello my name is Violetta!");
    }
    public static void morning() {
        System.out.println("I wake up at 7 am.");
        System.out.println("i had my breakfast");
        System.out.println("Goto School");
    }
    public static void code(){
        System.out.println("I code java ");
        System.out.println("Java is fun");
    }

}
