package day45_static2;

public class ParkingLot {
    public static void main(String[] args) {
        //print numberOfVehicles static way
        System.out.println(Vehicle.numberOfVehicles);
        Vehicle v1 = new Vehicle("tesla cybertruck");
        System.out.println(Vehicle.numberOfVehicles);
        System.out.println(v1.numberOfVehicles);
        Vehicle v2 = new Vehicle("toyota rav4");
        System.out.println(Vehicle.numberOfVehicles);
        System.out.println(v2.numberOfVehicles);
        Vehicle.numberOfVehicles = 10;
        Vehicle v3 = new Vehicle("Chevy Silverado"); //vehicle constructor runs
        System.out.println(Vehicle.numberOfVehicles);
        System.out.println(v1.numberOfVehicles);
        System.out.println(v2.numberOfVehicles);
        System.out.println(v3.numberOfVehicles);
        v2.numberOfVehicles = 300;
        System.out.println(v1.numberOfVehicles);
        System.out.println(v2.numberOfVehicles);
        System.out.println(v3.numberOfVehicles);
        v1.setModel("BMW 350i");
        System.out.println(v1.getModel());
        System.out.println(v2.getModel());
        System.out.println(v3.getModel());

    }
}
