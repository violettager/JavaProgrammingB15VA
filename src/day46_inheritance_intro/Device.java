package day46_inheritance_intro;

public class Device {
    String brand;
    double price;
    String country;

    public void use(){
        System.out.println("using "+brand+" for $"+price+" from: "+country);
    }
}
