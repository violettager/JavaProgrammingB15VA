package day18_do_While_Loop;

public class PrintEvenOddNumbers {
    public static void main(String[] args) {
       int num = 1;
       int num2 =100;
       for(num = 1; num<=100; num++){
           if(num%2==0){
               System.out.println(num+" ");
           }
       }
    }
}
