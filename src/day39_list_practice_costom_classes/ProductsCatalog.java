package day39_list_practice_costom_classes;

import java.util.*;

public class ProductsCatalog {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("iphone 6s");
        items.add("iphone 6s Plus");
        items.add("iphone X");
        items.add("Macbook Pro");
        items.add("ThumbDrive");
        items.add("Beats HeadPhones");
        items.add("Mouse");
        items.add("Charger");
        items.add("iPad");
        items.add("Dyson Vacuum");
        items.add("TV");
        items.add("Apple Watch");
        List<Double> prices = new ArrayList<>();
        prices.add(449.0);
        prices.add(549.0);
        prices.add(1149.0);
        prices.add(1499.99);
        prices.add(39.99);
        prices.add(349.99);
        prices.add(79.99);
        prices.add(39.99);
        prices.add(429.0);
        prices.add(399.0);
        prices.add(2199.0);
        prices.add(559.0);
        List<Double> monthlyPayments = new ArrayList<>(Arrays.asList(18.71, 22.88, 56.16, 79.49, 2.68, 15.12,
                8.98, 4.56, 18.31, 16.25, 89.49, 21.18));
        System.out.println("items = " + items);
        System.out.println("prices = " + prices);
        System.out.println("monthlyPayments = " + monthlyPayments);
        //print whole catalog in this form [iphone 6s - 449.0 - 18.71]
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". [" + items.get(i) + " price is = $" + prices.get(i) +
                    " monthly payment is = $" + monthlyPayments.get(i) + "].");
        }

        //declare new arraylist wholeCatalog and add all items info to it by concatenating it:
        System.out.println();
        List<String> wholeCatalog = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            wholeCatalog.add("[" + items.get(i) + " = $" + prices.get(i) +
                    " = $" + monthlyPayments.get(i) + "]");
            //System.out.println("wholeCatalog = " + wholeCatalog);

        }
        System.out.println("wholeCatalog = " + wholeCatalog);


        //look for the item in the items list, then print out;
        String item = "Dyson Vacuum";
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                System.out.println(items.get(i) + " | " + prices.get(i) + " | " + monthlyPayments.get(i));
            }
        }
        if (items.contains(item)) {
            int index = items.indexOf(item);
           // System.out.println(items.get(index) + " | " + prices.get(index) + " | " + monthlyPayments.get(index));
        } else {
            System.out.println("Dyson vacuum is not found! Keep coding java!");
        }

        /*
        Update price for an item
        String product  = "TV"
        double newPrice = 1099.0;
        find the product index in items, then update the price in prices list
         */
        String product = "TV";
        double newPrice = 1099;
        if (items.contains(product)) {
            int position = items.indexOf(product);
            prices.set(position, newPrice); // updating the price
            System.out.println(items.get(position) + " - " + prices.get(position));
        } else {
            System.out.println(product+ " not found! keep coding java!");
        }

        /*
        delete item from catalog
        String prodToDelete = "ThumbDrive";
        find the index of prodToDelete and remove it from items ,prices,monthlyPayments
        if done
        print deleted successfully
        else
        s.o.p item is not found
         */
        System.out.println("------------remove an item from the list--------------");
        String prodToDelete = "ThumbDrive";
        if (items.contains(prodToDelete)) {
            int index = items.indexOf(prodToDelete);
            items.remove(index);
            prices.remove(index);
            monthlyPayments.remove(index);// updating the price
            System.out.println(prodToDelete+" deleted!");
        } else {
            System.out.println(prodToDelete+ " not found! keep coding java!");
        }

        //remove all iPhone from the list
        System.out.println("---------------------------------------------------");
       // String delete = "iPhone";
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).toLowerCase().contains("iphone")){
                //int index1 = items.indexOf(delete);
                items.remove(i);
                prices.remove(i);
                monthlyPayments.remove(i);// updating the price
                i--;
                System.out.println(" deleted!");

            }

        }
        System.out.println("items = " + items);
        System.out.println("prices = " + prices);
        System.out.println("monthlyPayments = " + monthlyPayments);

        for (int i = 0; i < prices.size(); i++) {
            if(prices.get(i)<500){
                System.out.println(items.get(i)+" - "+prices.get(i)+" - "+monthlyPayments.get(i));
            }

        }
        System.out.println();
        System.out.println();
        // 8. find the most expensive item and print out  ( MacBook pro)
        int maxPriceIndex = 0;
        for (int i = 0; i <prices.size() ; i++) {
            if(prices.get(i) > prices.get(maxPriceIndex)){
                maxPriceIndex = i;
            }
        }
        System.out.println("The most expensive item is  =   "+items.get(maxPriceIndex) + " - "
                + prices.get(maxPriceIndex) + " - " + monthlyPayments.get(maxPriceIndex));
        System.out.println();
// 9. find the least expensive item and print out  (charger)
        int min = 0;
        for (int i = 0; i <prices.size() ; i++) {
            if(prices.get(i) < prices.get(min)){
                min = i;
            }
        }
        System.out.println("The least expensive item =   "+items.get(min) + " - " + prices.get(min) + " - " + monthlyPayments.get(min));
        System.out.println();


    }
}



