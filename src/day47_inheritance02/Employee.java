package day47_inheritance02;

public class Employee  extends Object{
    private String name;
    private String title;

    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public Employee(){
    System.out.println("EMPLOYEE NO-ARGS CONSTRUCTOR ");
   // super(); ALWAYS HAS TO BE FIRST WE USE IT TO CALL PARENT CLASS CONSTRUCTOR
    System.out.println("EMPLOYEE NO-ARGS CONSTRUCTOR");
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
