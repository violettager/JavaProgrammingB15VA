package day40_custom_classes;

import day02_intro_to_variables.MyArt;

public class Product {
    String title;
    double price;                 //BLUE PRINT!!!
    int rating;
    String seller;
    //custom method to act as behavior for Product class
    public void displayInfo(){
        System.out.println("-----Product info-----");
        System.out.println("title = "+title);
        System.out.println("price = $"+price);
        System.out.println("rating = "+rating);
        System.out.println("seller = "+seller);
    }


    public static void main(String[] args) {
        Product prod1 = new Product();
        prod1.title = "Wooden Spoon";
        prod1.price = 14.99;
        prod1.rating = 5;
        prod1.seller = "Mr.Memento";


        // how to read values from object

        System.out.println("prod1 object title = "+prod1.title);
        System.out.println("prod1 object price = "+prod1.price);
        System.out.println("prod1 object rating = "+prod1.rating);
        System.out.println("prod1 object seller = "+prod1.seller);

        //call the method of Product class
        //objName.methodName();

    }

}
