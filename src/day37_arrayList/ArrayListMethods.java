package day37_arrayList;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Mclean");
        cities.add("Alexandria");
        cities.add("Chicago");
        cities.add("Baku");
        cities.add("Kabul");
        cities.add("Tashkent");
        cities.add("Tehran");
        cities.add("Asmara");
        cities.add(0,"Calamba"); //add Calamba to index 0
        cities.add(1,"Reston"); //add Reston to index 1
        
        System.out.println("cities = " + cities);
        
        cities.add(2,"Yerevan");
        System.out.println("cities = " + cities);

        //replace/change index 4 to New York
        //replace/change 6 to Samarkand
        cities.set(4,"New York");
        cities.set(6,"Samarkand");
        System.out.println("cities = " + cities);
        
        // remove value at index 3
        cities.remove(3);
        System.out.println("cities = " + cities);

        //remove a certain city
        cities.remove("New York");
        System.out.println("cities = " + cities);
        
        cities.remove(2);
        cities.remove("Tashkent");
        System.out.println("cities = " + cities);
        System.out.println("Cities count = "+cities.size());
        
        
    }
}
