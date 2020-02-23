package day45_static2;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlock.staticMethod();
        StaticBlock stbObj = new StaticBlock();
        StaticBlock stbObj2 = new StaticBlock();
        StaticBlock.InnerClass.InnerClassStaticMethod();


    }
}
