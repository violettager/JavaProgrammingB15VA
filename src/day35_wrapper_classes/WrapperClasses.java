package day35_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer num = new Integer(10);
        Integer num2 = 33;
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);
        int num3 = 44;
        
        String strNum = num.toString();
        System.out.println("strNum = " + strNum);
        System.out.println(Integer.sum(40,30));
        System.out.println(Integer.max(30,10));
        System.out.println(Integer.min(33,2));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.compare(1,5)); //-1
        System.out.println(Integer.compare(10,10));//0
        System.out.println(Integer.compare(5,1));//1






    }
}
