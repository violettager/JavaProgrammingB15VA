package day48_overriding;

public class Cat extends Animal{
    public void speak() {
        System.out.println("cat is saying meow..");
    }


    public void move() {
        System.out.println("cat is running");
    }

    @Override
    public void eat(String food) {
        System.out.println("cat is eating "+food);
    }
}

