package day33_methods;

public class Calculator {

    public static void main(String[] args) {
        addNums(5,3);
       // int sum = addNums(10,4); ERROR
        int sum = add(10,4);
        System.out.println("sum = " + sum);
        System.out.println(add(44,22));
        int difference = minus(44,1);
        System.out.println("difference = " + difference);
    }
    public static int add(int num1,int num2){
        int result = num1+num2;
        return result;
    }
    
    
    public static void addNums(int num1,int num2){
        int result = num1+num2;
       System.out.println("result = " + result);
    }
    public static int minus(int num1, int num2){
        int resultSub = num1-num2;
        return resultSub;
    }

}
