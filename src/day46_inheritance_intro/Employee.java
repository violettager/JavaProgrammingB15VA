package day46_inheritance_intro;
//employee is-a person
public class Employee extends Person{
 public String jobTitle;
 public void work(){
     System.out.println(name+" is working hard as "+jobTitle);
 }


}
