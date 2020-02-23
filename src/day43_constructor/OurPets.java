package day43_constructor;
import java.util.*;
public class OurPets {
    public static void main(String[] args) {


    pet shrek = new pet();
        shrek.setName("Shrek");
        shrek.setType("dog");
        System.out.println(shrek.toString());
        System.out.println(shrek.getName());
        System.out.println(shrek.getType());
    pet mimi = new pet();
        mimi.setPetInfo("cat", "Mimi");
        System.out.println(mimi.toString());
        shrek.speak();
        mimi.speak();
    pet laika= new pet("dog", "Laika");
    pet simba= new pet("lion", "Simba");
        System.out.println(laika.toString());
        System.out.println(simba.toString());
}
}
