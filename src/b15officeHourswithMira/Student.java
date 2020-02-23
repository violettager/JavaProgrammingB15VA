package b15officeHourswithMira;

public class Student {
    String name;

    public Student (String name){
        this.name = name;
    }
    public void sendFile(String email, MicrosoftDocument md ){
        System.out.println(md.name);
        md.objective();
        System.out.println("Email: "+email);

    }
}
