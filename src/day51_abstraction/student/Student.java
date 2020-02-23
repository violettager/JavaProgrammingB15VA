package day51_abstraction.student;

public abstract class Student {
    String name;
    //ABSTRACT CLASS OR METHOD CANNOT BE PRIVATE OR FINAL
    // CANNOT BE STATIC ABSTRACT METHOD
    /*
    CONCRETE CLASS:
    child class of abstract parent class
    concrete class is not abstact class
    concrete class is responsible for implementation/overriding of all abstract methods
     */
    public Student(){
        System.out.println("STUDENTS CONSTRUCTOR... ");
    }
    public abstract void attendClass();


    public void code(String lan){
        System.out.println("student is coding in language - "+lan+"...");
    }
}
