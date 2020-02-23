package day50_inheritance_hiding;

public class CapitalCity extends City {
    private long population;
    private String country;

    public CapitalCity() {
       super();
    }

    public CapitalCity(String name , String country,  long population) {
      // super(name);
        setName(name);
        this.country = country;
        this.population = population;

    }
    public void letsBuildTheRoadInCapital(){
        System.out.println("Capital city -  lets build a road...");
        buildARoad();

    }
    public void buildARoad(){
        System.out.println("Capital city - building a road...");
    }
    public String toString(){
       // return "country = "+country+", population = "+population;
        return super.toString()+", country = "+country+", population = "+population;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
