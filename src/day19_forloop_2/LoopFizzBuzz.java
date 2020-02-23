package day19_forloop_2;

public class LoopFizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
            if(i%5==0&&i%3==0){
                System.out.println(i+" is Fizzbuzz number");
            }else if(i%3==0){
                System.out.println(i+" is FizzBuzz number");
            }else if(i%5==0){
                System.out.println(i+" is FizzBuzz number");
            }

        }
    }

}
