package day40_custom_classes;

public class Car {
    String model;
    double price;
    String color;
    int year;

    public void setCarInfo(String newModel, double newPrice, String newColor, int newYear) {
        //assign param variables to object variables
        model = newModel;
        price = newPrice;
        color = newColor;
        year = newYear;
    }


    public void drive() {
        System.out.println(model + " is driving");
    }

    public void showThePrice() {
        System.out.println(model + " price is $" + price);


    }

    public void getCarInfo() {
        System.out.println("Car is:" + model + " " + price + " " + color + " " + year);

    }

}
