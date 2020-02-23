package day45_static2;

public class VariableAccess {
    int instanceCount = 10;
    static int staticCount = 15;
    public static void staticMethod(){
        System.out.println("staticCount = " + staticCount);
       // System.out.println("instanceCount "+instanceCount);
    }
    public void nonStaticInstanceMethod(){
        System.out.println("staticCount = " + staticCount);
         System.out.println("instanceCount "+instanceCount);
    }

    public static void main(String[] args) {
        // variable access
        //System.out.println("instanceCount "+instanceCount);
        System.out.println("staticCount = " + staticCount);
        //method access
        staticMethod();

        // how to access instance (non-static) variable/method
        //first create object using new keyword
        VariableAccess vbObj = new VariableAccess();
        System.out.println("instanceCount "+vbObj.instanceCount);
        vbObj.nonStaticInstanceMethod();

    }

}
