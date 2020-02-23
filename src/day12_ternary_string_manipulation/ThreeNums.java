package day12_ternary_string_manipulation;

public class ThreeNums {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 22;

        if(num1>=num2 && num1>=num3){
            System.out.println(" num1 is largest and its value is: "+num1);
        }else if(num2>=num3 && num2>=1){
            System.out.println(" num2 is largest and its value is: "+num2);
        }else{
            System.out.println("num3 is largest and its value is: "+num3);
        }
    }
}
