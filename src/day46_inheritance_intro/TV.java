package day46_inheritance_intro;

public class TV extends Device {
    double screenSize;
    boolean isSmart;

    public void watch(){
        System.out.println(" it is "+screenSize+" inch, is it smart? =  "+isSmart);
    }
}
