package day48_overriding;

public class Horse extends Animal{

    public void move() {
        System.out.println("Horse is galloping");
    }


    public void speak() {
        System.out.println("Horse says iha-ha-ha-ha");
    }

    @Override
    public void eat(String food) {
        System.out.println("horse is eating "+food);
    }
}
