package day12_ternary_string_manipulation;

public class CafeNestedIf {
    public static void main(String[] args) {
        String order = "drink";
        String drink = "coffee";
        String food = "";
        double price  = 0;


        if(order.equals("drink")){
            //inner if statement. will run only when order is drink!
            if(drink.equals("soda")){
                price = 1.99;
            }else if (drink.equals("coffee")){
                price = 4.99;
            }else if(drink.equals("water")){
                price = 1.55;
            }else{
                System.out.println("no such drink available");
            }
            }else if(order.equals("food")){
              if (food.equals("sandwich")){
                price = 7.45;
            }else if (food.equals("soup")){
                price = 6.33;
            }else if (food.equals("salad")){
                price  = 9.99;
            }else{
                System.out.println("no such food available");
            }


        }
        System.out.println("total price: $"+price);


    }
}
