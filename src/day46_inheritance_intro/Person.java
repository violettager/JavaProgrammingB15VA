package day46_inheritance_intro;

public class Person {
   public String name;
    public int age;
    public char gender;

    public void walk(){
        System.out.println(name+" is walking...");
    }
    public void speak(){
        System.out.println(name+" is talking non stop...");
    }
    public void eat(String meal){
        System.out.println(name+" is eating "+meal);
    }

}
