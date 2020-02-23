package day43_constructor;
import java.util.*;
public class ComputerObjects {
    public static void main(String[] args) {
        //create a computer using no-args constructor
        Computer dell = new Computer();
        //create a computer using 3 args constructor
        Computer hp = new Computer("HP Pavilion", "Windows 10 Pro", 1400.0);
        String[] names = new String[3];
        names[0] = "java";
        names[1] = "simba";
        names[2] = new String("calamba");//one of the ways
        //Arrays for Computers
        Computer[] compArray = new Computer[3];
        //shorter, directly use new keyword to assign object to array
        compArray[0] = new Computer("hp jdsk32329", "Windows", 219.99);
        //longer , first create object than assign to array index
        Computer dellInsp = new Computer("Dell inSpriron", "win11", 349.99);
        compArray[1] = dellInsp;
        compArray[2] = new Computer("Macbook Pro 16in", "MacOs", 2599);
        //call toString  methods for all 3 computers
        System.out.println(compArray[0].toString());
        System.out.println(compArray[1].toString());
        System.out.println(compArray[2].toString());
        System.out.println(Arrays.toString(compArray));
        for (Computer eachComp : compArray) {
            //print model for each one
            System.out.println(eachComp.getBrand());
        }
    }
}
