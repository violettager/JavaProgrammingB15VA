package day41_encapsulation;

public class ApplePie {
    public static void main(String[] args) {
        Recipe applePie = new Recipe(); //Instant Variables which describe properties
        applePie.ApplePie("flour","sugar","apples",10,30);
       Recipe ChickenPie = new Recipe();
       ChickenPie.chickenPie("Chicken","Milk","Vegetables","eggs","Flour",10,50);
    }
}
