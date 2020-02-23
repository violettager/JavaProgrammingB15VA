package day07_operators_casting_boolean_if;

public class BooleanComparisonOperators {
    public static void main(String[] args){
        System.out.println(10>5);
        System.out.println(10>11);
        System.out.println(88>=77);
        System.out.println(99>=99);

        int num1  = 100;
        int num2 = 200;   //100 200
        System.out.println(num1>num2);//false
        System.out.println(num1<num2);//true
        System.out.println(num1==num2);//false
        System.out.println(num1!=num2);//true



        boolean b1 = 123>100;
        System.out.println("b1: "+b1);

        int currentSpeed = 60;
        int speedLimit = 55;
        boolean overLimit = currentSpeed>speedLimit;
        System.out.println("over limit: " +overLimit);
        boolean underOrAtLimit = currentSpeed<=speedLimit;
        System.out.println("under or at limit: "+underOrAtLimit);


        System.out.println("################################################");
        char letter1 ='A';
        char letter2 = 'B';
        System.out.println(letter1>letter2);//false
        System.out.println(letter1<letter2);//true
        System.out.println(letter1!=letter2); //true


        System.out.println("wooden spoon"=="wooden spoon");


        String str = "java";
        System.out.println(str=="java");





    }

}