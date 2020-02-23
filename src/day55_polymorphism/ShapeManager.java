package day55_polymorphism;
import day54_polymorphism.*;
import java.util.*;
public class ShapeManager {
    public static void drawSquare(Square squareObj) {
        System.out.println("Drawing a square...");
        squareObj.draw();
    }
    public static void drawShape(Shape shapeObj) {
        System.out.println("Drawing a shape..." + shapeObj.type);
        shapeObj.draw();
    }
    public static void drawShape(List<Shape> shapeList) {
        for (Shape each : shapeList) {
            System.out.println("Drawing a shape..." + each.type);
            each.draw();
        }
    }
    public static void drawShapeFromObject(Object object) {
        System.out.println("Drawing shape from object...");
        System.out.println(object.getClass().getSimpleName());
    }

    public static Shape buildingShape(String str){
        System.out.println("building shape of type - "+str+"...");
        Shape retShape = null;
        switch (str){
            case "Triangle":
                retShape = new Triangle();
                break;
            case "Diamond":
                retShape = new Diamond();
                break;
            case "Square":
                retShape = new Square();
                break;
            case "Shape":
                retShape = new Shape();
                break;
        }
        return retShape;
    }
}