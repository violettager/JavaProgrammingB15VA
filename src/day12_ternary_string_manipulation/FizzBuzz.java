package day12_ternary_string_manipulation;

public class FizzBuzz {
    public static void main(String[] args) {
        int num = 10;

        if(num%5==0 && num%3==0){
            System.out.println("Fizzbuzz");
        }else if(num%3==0){
            System.out.println("Fizz");
        }else if(num%5==0){
            System.out.println("buzz");
        }
    }
}
