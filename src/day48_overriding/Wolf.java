package day48_overriding;

public class Wolf extends Animal{
    public void speak(){
        System.out.println("Wolf howls auuuuuuuuuuw");
    }

    @Override
    public void move() {
        System.out.println("wolf is hunting");
    }

    @Override
    public void eat(String food) {
        System.out.println("wolf is eating "+food);
    }
}
