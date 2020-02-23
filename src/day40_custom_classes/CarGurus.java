package day40_custom_classes;

import day37_arrayList.SortList;

public class CarGurus {
    public static void main(String[] args) {
        Car acura = new Car();
        acura.model = "Acura ILX";
        acura.price = 28150.0;
        acura.color = "white";
        acura.year = 2020;
        System.out.println("acura model: " + acura.model);
        acura.drive();
        acura.showThePrice();

        Car BMW = new Car();
        BMW.model = "BMW 5 series";
        BMW.price = 51115.0;
        BMW.color = "black";
        BMW.year = 2019;
        BMW.drive();
        BMW.showThePrice();
        System.out.println("-------------------------------------------------------");
        Car porsche = new Car();
        porsche.setCarInfo("Porsche 911", 127753.0, "Silver", 2020);
        porsche.drive();
        porsche.showThePrice();
        System.out.println("-------------------------------------------------------");
        Car toyota = new Car();
        toyota.setCarInfo("Toyota Prius", 21452.0, "Grey", 2019);
        System.out.println(toyota.model);
        System.out.println(toyota.price);
        System.out.println(toyota.color);
        System.out.println(toyota.year);
        System.out.println("------------------------------------------------------");
        toyota.getCarInfo();
        System.out.println("------------------------------------------------------");
        BMW.getCarInfo();
        System.out.println("------------------------------------------------------");
        acura.getCarInfo();
        System.out.println("------------------------------------------------------");
        porsche.getCarInfo();

        //compare prices of bmw and porsche and print which is more exp
        if(BMW.price>porsche.price){
            System.out.println("BMW is more expensive");
        }else if(porsche.price>BMW.price){
            System.out.println("Porsche is more expensive");
        }else{
            System.out.println("price is equal!");

        }


    }
}
