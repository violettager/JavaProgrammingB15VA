package day54_polymorphism;

public class ShapeTest {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.draw();
        System.out.println();
        Triangle tr = new Triangle();
        tr.draw();
        System.out.println();
        Diamond d = new Diamond();
        d.draw();


    }
}
