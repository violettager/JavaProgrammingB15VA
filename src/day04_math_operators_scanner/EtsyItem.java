package day04_math_operators_scanner;

import java.util.SortedMap;

public class EtsyItem {
    public static void main(String[] args){
        /*EtsyItem:
    - String title
    - String seller
    - double stars
    - int ratingsCount
    - double price
    - boolean bestSeller
    - boolean freeShipping

         */

        String title = "Soup Cook off Personalized Wooden Spoon";
        String seller = "PersonalizedGallery";
        double stars = 5.0;
        int ratingsCount = 8901;
        double price = 8.00;
        boolean bestSeller = true;
        boolean freeShipping = true;


        System.out.println("Item title is "+title);
        System.out.println("Seller name is < "+seller+" >");
        System.out.println("Product has "+stars+" stars");
        System.out.println("Product has " +ratingsCount+" ratings!");
        System.out.println("Price is $"+price);
        System.out.println("Best seller is "+bestSeller);
        System.out.println("Is it free shipping? -" +freeShipping+" Great!");


        //#####################################################################


        //city1,city2,ticketPrice
        String city1 = "New York";
        String city2 = "Chicago";
        double ticketPrice = 285.99;
        //From New York to Chicago is $285.99
        System.out.println("From "+city1+" to "+city2+" is $"+ticketPrice);




    }
}
