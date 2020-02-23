package day11_string_comparison_logical;

public class WeatherActivities {
    public static void main(String[] args) {
        String weather = "sunny";
        switch(weather){
            case "sunny":
                System.out.println("Go to park,\nCode Java");
                break;
            case"hot":
                System.out.println("Go swimming,\nCode Java");
                break;
            case"windy":
                System.out.println("Fly a kite, \nCode Java");
                break;
            case"snowy":
                System.out.println("Build a snowman, \nCode Java ");
                break;
            case"rainy":
                System.out.println("Stay at home, \nCode Java");
                break;
            default:
                System.out.println("Keep coding Java in any weather!");

        }
    }
}
