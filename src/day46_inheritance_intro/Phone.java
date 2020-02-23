package day46_inheritance_intro;

public class Phone extends Device {
    String carrier;

    public void call(){
        System.out.println(" and the carrier is "+carrier);
    }
    public void text(String message ){
        System.out.println(" texting from  "+brand +" phone using "+carrier);
        System.out.println("my message is  - "+message);
    }
}
