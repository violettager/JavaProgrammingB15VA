package day52_interfaces;

public abstract class MessagingApp {
    String name;
    protected boolean isFree;
    boolean allOSCompatible;
    private int count ;
    public static final String APP_TYPE  = "Messenger";

    public  MessagingApp(){
        System.out.println("Messaging app no-args constructor... ");
    }

    //abstract method
    public abstract void sendMessage(String msg) ;
    //non abstract method
    public void launch(){
        System.out.println("MessagingApp is launching...");

    }
    //static method
    public static void close(){
        System.out.println("Messaging App is closing...");
    }
}
