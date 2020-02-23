package day34_methodspractice;

public class MethodOverloading {
    public static void main(String[] args) {
        sum(4,3);
        sum(10,5.4);

    }

    public static void sum(int num1, int num2) {
        System.out.println("sum(int num1,int num2)");
        System.out.println("Result: " + (num1 + num2));
    }

    public static void sum(int num1, int num2, int num3) {
        System.out.println("sum(int num1,int num2,int num3)");
        System.out.println("Result: " + (num1 + num2 + num3));
    }
    public static void sum(String str1,String str2){
        System.out.println("sum(String str1,String str2)");
        System.out.println("Result: " + ( str1 +  str2));
    }
    public static void sum(double num1, double num2) {
        System.out.println("sum(double num1, double num2)");
        System.out.println("Result: " + (num1 + num2 ));
}
}