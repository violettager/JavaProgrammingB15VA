package day54_polymorphism;

public class Triangle extends Shape {
    public Triangle(){
        type = "triangle";
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("triangle: ");
        for (int i = 0; i < 7; i++) {
            for (int j = 7 - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
