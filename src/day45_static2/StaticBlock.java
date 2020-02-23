package day45_static2;

public class StaticBlock {
    static{
        System.out.println("Static Block - once before everything else");
    }
    public  StaticBlock(){
        System.out.println("CONSTRUCTOR - RUNS EVERYTIME OBJECT IS CREATED ");
    }
    public static void staticMethod(){
        System.out.println("STATIC METHOD");
    }
    public static class InnerClass{
        public static void InnerClassStaticMethod(){
            System.out.println("hello from inner class");
        }
    }

}
