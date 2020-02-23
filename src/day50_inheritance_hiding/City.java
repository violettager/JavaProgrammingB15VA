package day50_inheritance_hiding;

public class City {
    private String name;

    public City() { //you can make it private but after would not be able to create object from it
        name = "undefined";
    }
    public void buildARoad(){
        System.out.println(" city - building a road...");

    }
    public void letsBuildARoad(){
        System.out.println("city - lets build a road...");
        buildARoad();
    }
    public City(String name){
        this.name = name;
    }

    public String toString(){
        return"name = "+name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
