package day50_inheritance_hiding;

public class CityObjects {
    public static void main(String[] args) {
        City city = new City("Calamba");
        CapitalCity capital = new CapitalCity("Moskow", "Russia", 20000000L);
        System.out.println(city.toString());
        System.out.println(capital.toString());
        city.buildARoad();
        capital.buildARoad();
        //test method hiding
        CapitalCity astana = new CapitalCity("Astana", "Kazakhstan", 1500000l);
        astana.letsBuildARoad();
        System.out.println(astana.toString());
        CapitalCity ankara = new CapitalCity("Ankara","Turkey",8000000l);
        ankara.letsBuildARoad();
        ankara.letsBuildTheRoadInCapital();
    }
}
