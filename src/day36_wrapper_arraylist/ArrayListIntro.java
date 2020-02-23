package day36_wrapper_arraylist;
import java.util.ArrayList;
public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList myFirstList = new ArrayList();
        //assign values
        myFirstList.add("java");
        myFirstList.add("javascript");
        myFirstList.add("python");
        myFirstList.add("repl.it");
        myFirstList.add(1200);
        myFirstList.add(34.5);
        myFirstList.add(true);
        System.out.println("myFirstList = " + myFirstList);
        //Declare ArrayList that can hold only Integers
        ArrayList <Integer> myList= new ArrayList<>();
        myList.add(100);
        myList.add(200);
        myList.add(300);
        System.out.println(myList.toString());

    }
}
