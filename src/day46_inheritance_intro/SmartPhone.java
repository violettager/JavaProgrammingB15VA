package day46_inheritance_intro;

public class SmartPhone extends Device{

    int memorySize;
    public void useApp(String appName){
        System.out.println("Using "+ appName+" in "+ brand+" smartphone..");
    }
}

