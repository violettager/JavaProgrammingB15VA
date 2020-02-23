package day45_static2;

public class Vehicle {
    private String model;
    public static int numberOfVehicles = 0;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public Vehicle(String model){
        System.out.println("parking "+model);
        this.model =model;
        numberOfVehicles++;
    }
    public Vehicle(){
        System.out.println("parking an Unknown model Vehicle");
        numberOfVehicles++;

    }


    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                '}';
    }
}
