package day50_inheritance_hiding;

public class CarHasAEngine {
    public static void main(String[] args) {


    Engine eng1 = new Engine("m50b25",192,6);
        System.out.println(eng1.toString());

        Car car1 = new Car("bmw 525i",eng1);
        System.out.println(car1.getEngine().toString());

        Engine eng2 = new Engine("m0b00",200,8);
        System.out.println(eng1.toString());

        Car car2 = new Car("mercedes", new Engine("m0b00",200,8));
        System.out.println(car2.getEngine().toString());
        System.out.println(car2.toString());
        Car corolla = new Car();
        corolla.setModel("Toyota");


}
}