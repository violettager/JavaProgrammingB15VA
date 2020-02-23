package day37_arrayList;
import java.util.*;
public class PriceList {
    public static void main(String[] args) {
        List<Double> prices = new ArrayList(Arrays.asList(9.99,5.44,10.99,2.49,299.49,57.5, 123.45));
        // calculate sum of all prices
        double sum = 0.0;
        for (int i = 0; i < prices.size(); i++) {
            sum += prices.get(i);
            
            
            
        }
        System.out.println("sum = " + sum);
        
        
        //declare double arraylist cheap
        List<Double> cheap = new ArrayList<>();
        for (int i = 0; i <prices.size() ; i++) {
            if(prices.get(i)<20.0){
                cheap.add(prices.get(i));
            }
            
            
        }
        System.out.println("expencive = " + cheap);
    }
}
