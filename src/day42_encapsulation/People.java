package day42_encapsulation;

public class People {


    public static void main(String[] args) {
        Person p1 = new Person();
        //p1.name = ""; ERROR name is PRIVATE
        //p1.age = -22; ERROR age is PRIVATE
        System.out.println(p1.toString());
        p1.setName("Vasyl");
        System.out.println(p1.getName());
       Person p2 = new Person();
       p2.setName("Sarah");
        System.out.println(p2.getName());
        p2.setAge(23);
        System.out.println(p2.toString());
    }
}
