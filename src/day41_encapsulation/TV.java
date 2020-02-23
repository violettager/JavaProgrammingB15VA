package day41_encapsulation;
public class TV {
    String brand;
    String powerState; //"on" "off"
    int channel;

    public void turnOn(){
        //if is off, then turn it On
        if(powerState.equals("off")){
            System.out.println("INFO: Turning ON " + brand +" TV");
            powerState = "on";
        }
    }
    public void turnOff(){
        //if it is ON, then Turn OFF
        if(powerState.equals("on")){
            System.out.println("INFO: Turning OFF " + brand +" TV");
            powerState = "off";
        }
    }
    public void setTVInfo(String pBrand, String pPowerState, int pChannel){
        System.out.println("INFO: setting TV information..");
        brand = pBrand;
        powerState = pPowerState;
        channel = pChannel;
    }

    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", powerState='" + powerState + '\'' +
                ", channel=" + channel +
                '}';
    }

    public void setChannel(int newChannel){
        System.out.println("Info: changing channel...");
        channel = newChannel;
    }
    public void channelUp(){
        System.out.println("INFO: next channel...");
        channel++;

    }
    public void channelDown(){
        System.out.println("INFO: previous channel...");
        channel--;
    }


}
