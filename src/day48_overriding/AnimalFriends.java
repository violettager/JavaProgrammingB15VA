package day48_overriding;

public class AnimalFriends extends Cat{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();
        animal.move();

        Cat cat = new Cat();
        cat.speak();
        cat.move();

        Horse horse = new Horse();
        horse.speak();
        horse.move();

        Wolf wolf = new Wolf();
        wolf.move();
        wolf.speak();

        animal.eat("food");
        cat.eat("fish");
        horse.eat("grass");
        wolf.eat("meat");
    }


}
