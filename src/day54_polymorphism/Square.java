package day54_polymorphism;

public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("square: ");
        System.out.println("* * * * * * * * * *");
        System.out.println("*                 *");
        System.out.println("*                 *");
        System.out.println("*                 *");
        System.out.println("*                 *");
        System.out.println("*                 *");
        System.out.println("* * * * * * * * * *");

    }
}
