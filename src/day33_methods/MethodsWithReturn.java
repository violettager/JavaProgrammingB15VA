package day33_methods;

public class MethodsWithReturn {
    public static void main(String[] args) {
        System.out.println(getName());
        String myName = getName();
        System.out.println("myName = " + myName);
        int wallet  = giveMe5Dollars();
        System.out.println("wallet =  $" + wallet);
    }
    public static int giveMe5Dollars(){
        int dollar = 5;
        return dollar;
    }
    public static String getName(){
        return "Violetta";
    }
}
