package day11_string_comparison_logical;

public class TollCalculator {
    public static void main(String[] args) {
        String vehicleType = "truck";
        boolean isRushHour = true;
        double tollPrice = 0;
        if(vehicleType.equalsIgnoreCase("car")&&isRushHour==false ){
            tollPrice = 3.0;
            System.out.println("Vehicle type: car. non-rush hour");
        }else if(vehicleType.equalsIgnoreCase("car")&&isRushHour==true){
            tollPrice = 6.56;
            System.out.println("Vehicle type: car. is rush-hour");
        }else if(vehicleType.equalsIgnoreCase("truck")&& !isRushHour){
            tollPrice = 6.79;
            System.out.println("vehicle type: truck. is not rush-hour");
        }else if(vehicleType.equalsIgnoreCase("truck")&& isRushHour==true){
            tollPrice = 12.55;
            System.out.println("vehicle type: truck. is rush hour");
        }else{
            System.out.println("vehicle is not recognized, use a different road!");
        }
        System.out.println(tollPrice);
    }
}
