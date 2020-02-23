package day07_operators_casting_boolean_if;

public class TypeCasting {
    public static void main(String[] args){
        // Automatic casting -> Implicit casting
        //From Small to large
        byte b  = 100;
        short sh  = b;
        System.out.println("b: -> "+b);
        System.out.println("sh: -> "+sh);
        int n  = 1234567;
        long l = n;
        System.out.println("n = "+n);
        System.out.println("l = "+l);

        double d = n;
        System.out.println("d = "+d);
        //explicit casting: paranthesis before variable name and type

        int n2 = 120;
        byte b2 = (byte)n2;
        System.out.println("n2 = "+n2);
        System.out.println("b2 = "+b2);


        double price = 120.44;
        int intPrice = (int)price;
        System.out.println("price = "+price);
        System.out.println("intPrice = "+intPrice);


        int num3 = 1000;
        byte b3 = (byte)num3;
        System.out.println("num3 "+num3);
        System.out.println("b3 = "+b3);// - 24 NOT WORKING!


    }
}
