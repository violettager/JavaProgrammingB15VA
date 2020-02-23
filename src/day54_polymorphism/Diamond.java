package day54_polymorphism;

public class Diamond extends Shape {
    public Diamond() {
        type = "Diamond";

    }

    @Override
    public void draw() {
        System.out.println("diamond:");
        for (int i = 0; i < 5; i++)
            System.out.println("    *********".substring(i, 5 + 2 * i));
        for (int i = 5; i > 0; i--)
            System.out.println("     **********".substring(i - 1, 5 + (2 * i) - 3));


        }
        public void finalize(){
            System.out.println("diamond is about to go to garbage collector...");
        }
    }

