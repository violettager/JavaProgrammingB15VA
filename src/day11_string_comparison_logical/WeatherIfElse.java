package day11_string_comparison_logical;

public class WeatherIfElse {
    public static void main(String[] args) {
        String weather = "sunny";
        if(weather.equals("sunny")){
            System.out.println("Go to park and code java");
        }else{
            System.out.println("Go to school and Code java");
        }
        System.out.println("***************************************************************");
        // java is a case sensitive, the words has to be exact the same as given
        String item = "Wooden Spoon";
        if(item.equals("Wooden Spoon")){
            System.out.println("15.938 wooden spoons for sale");
        }else{
            System.out.println("NO wooden spoons!");
        }

        if(item.equalsIgnoreCase("wooden Spoon")){ //ignores the case sensitivity
            System.out.println("15.938 wooden spoons for sale");
        }else{
            System.out.println("NO wooden spoons!");
        }
    }
}
