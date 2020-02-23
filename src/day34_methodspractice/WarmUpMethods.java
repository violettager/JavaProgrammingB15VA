package day34_methodspractice;

public class WarmUpMethods {
    public static void main(String[] args) {
        login("student@cybertek.com","cybertekb15");
        drive("Toyota",34);
        drive("Mercedes",250);
        drive("Tesla",-2);

    }
    public static void login(String userName,String password){
        if (userName.equalsIgnoreCase("student@cybertek.com")&&password.equalsIgnoreCase("cybertekb15")){
            System.out.println("login successful ");
        }else{
            System.out.println("Error, something is wrong!");
        }



    }
    public static void drive(String car, int speed){
        if(speed<0){
            System.out.println("Invalid Speed, cannot be negative");
        }else if(speed==0){
            System.out.println(car+" is not moving at "+speed+ " speed");
        }else if (speed<=55){
            System.out.println(car+" is driving at "+speed+  " mph" );
        }else if(speed>55&& speed<100){
            System.out.println(car+" is speeding at "+speed+" mph");
        }else if(speed>=100){
            System.out.println(car+" is flying at "+speed+ " mph");
        }
    }
}
