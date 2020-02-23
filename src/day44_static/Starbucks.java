package day44_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Starbucks {

    /*
    method: drinkCoffee
    param: coffee coffeeObj
    return: void
    Drinking coffeeObj.toString and coding java
    -----------------------------------
    method: orderCoffee
    param: String coffeeName, String coffeeSize
    Return: Coffee
    Create coffeeObj using CoffeeName, coffeeSize,43.99
    and return from method
    ex:
    Coffee myCoffee = orderCoffee(White mocha
     */

    public static void drinkCoffee(Coffee coffeeObj){
        System.out.println("Drinking "+coffeeObj.getName()+" and coding java");

    }
    public static Coffee orderCoffee(String coffeeName, String coffeeSize){
        System.out.println("Preparing "+ coffeeSize+" "+coffeeName);
        Coffee readyCoffee = new Coffee(coffeeName,coffeeSize,0.99);
        return readyCoffee;
    }
    public static void main(String[] args) {
        Coffee cappuccino  = new Coffee("cappuccino","grande",3.99);
        cappuccino.drink();
        System.out.println(cappuccino.toString());

        //syntax for array of Coffees
        Coffee[] coffeeArray = new Coffee[2];
        coffeeArray[0] = cappuccino;
        coffeeArray[1] = new Coffee("Latte","venti",5.99);
        System.out.println(Arrays.toString(coffeeArray));

        //ArrayList of Coffees
        List<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(cappuccino);
        coffeeList.add(coffeeArray[1]);
        coffeeList.add(new Coffee("Nitro Brew","tall",3.49));
        System.out.println(coffeeList.toString());
        //drink first coffee

        coffeeList.get(0).drink();
        //drink all of them
        for (Coffee eachCoffee:coffeeList){
            eachCoffee.drink();
        }
        Coffee frappe = new Coffee("Frappe","tall",5.39);
        //call the method and pass  the object
        drinkCoffee(frappe);

        System.out.println("----------CALL ORDERCOFFEE METHOD------------");
        Coffee myCoffee = orderCoffee("white mocha","grande");
        myCoffee.drink();
        System.out.println(myCoffee.toString());

        Coffee myVentiLatte =orderCoffee("Vanilla Latte","venti");

        myVentiLatte.drink();

    }
}
