package day27_arrays06;
import java.util.*;
public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes","Jacket","Gloves","Airpods","iPad","Iphone"};
        double[]prices = {99.99,150.0,9.99,250.0,439.50,39.99};
        int[] itemIDs = {12345,12346,12347,12348,12349,123450};
        if(items.length==prices.length&& items.length==itemIDs.length){
            System.out.println("all arrays are equal");


        }else{
            System.out.println("items length is = " + items.length);
            System.out.println("prices length is = " + prices.length);
            System.out.println("itemIDs length is = " + itemIDs.length);
            System.out.println();
            System.out.println("Error!!!! Array length mismatch!");
            return;
        }
        System.out.println(items.length+" items purchased");
        double TotalPrice = 0;
        for (int i = 0; i < items.length; i++) {
            System.out.println(itemIDs[i]+"  --> "+items[i]+"  --> $"+prices[i]);
             TotalPrice+= prices[i];


        }
        System.out.println("TotalPrice = $" + (int)TotalPrice);
        System.out.println("TotalPrice with tax is = $" + (int)(TotalPrice*1.06));
        System.out.println();

        for (int i = 0; i < items.length; i++) {
            if(items[i].equals("Airpods")){
                System.out.println(itemIDs[i]+"  --> "+items[i]+"  --> $"+prices[i]);
                break;
            }

        }
        double max = prices[0];
        int maxPriceIndex = 0;
        for (int i = 0; i <items.length ; i++) {
            if(prices[i]>max){
                max = prices[i];
                maxPriceIndex = i;
            }



        }
        System.out.println("the most expensive item cost = $" + max+"  and it is -"+items[maxPriceIndex]);




    }
}
