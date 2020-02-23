package day22_arrays_intro;

public class SumOfArray {
    public static void main(String[] args) {
        double[] prices = {12.10,15.99,4.55,6.99,55.38,34.99};
        double total = 0;
        for(double eachPrice:prices){
            total = total+eachPrice;
        }
        System.out.println("total price = "+total);
        double moreThan10 = 0;
        for(double eachPrice:prices){
            if(eachPrice>10){
                moreThan10+=eachPrice;

            }

        }
        System.out.println("items with more than $10 value  is "+moreThan10);

        for(double eachPrice:prices){
            if(eachPrice>15){
                System.out.println(eachPrice+" = item is too expensive i don't have money ");
                break;
            }
        }
    }

}
