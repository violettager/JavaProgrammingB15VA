package day08_if_statements;

public class NiceDayOrNot {
    public static void main(String[] args) {
        System.out.println("What is the weather today?");
        int temperature = 69;
        if(temperature>=70){
            System.out.println("It is beautiful day. \nLet's go out and code Java.");
        }else{
            System.out.println("It is kind of cold today. \nLet's stay at home and code Java.");
            System.out.println();
        }
        System.out.println("Every day code java!!!!");
    }
}
