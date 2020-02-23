package day38_methods_with_Arraylist;
import java.util.*;
public class methodsReturnArrayList2 {
    public static void main(String[] args) {
        // called getMonth() and print out returned list
        System.out.println( getMonth() );
        // call getMonth() and assign return list into another list then print
        List<String> allMonthInYear = getMonth();
        System.out.println(allMonthInYear);
        for (String eachMonth : allMonthInYear) {
            System.out.println("eachMonth = " + eachMonth);
        }
        System.out.println(getMonth().get(0));
        System.out.println("==============");
        System.out.print(getIntList(10));
        System.out.print(getIntList(10));
        System.out.println();
        for (int i = 0; i <= 9; i++) {
            System.out.println(getIntList(i));
        }
        System.out.println("==============");
        //while (true)
        System.out.println(getRandomIntList(5));
    }
    // et numbers
    public static List<Integer> getRandomIntList(int size) {
        Random r = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= size; i++) {
            numbers.add(r.nextInt(101));
        }
        return  numbers;
    }
    /*
Methods: getIntList
Param:   int size
Return : List<Integer>
it creates list of integers and assign numbers from 1 until size then return it.
*/
    public static List<Integer> getIntList(int size) {
        List<Integer> getList = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            getList.add(i);
            //System.out.print(i+" ");
        }
        return getList;
    }
    /*
Methods: getMonth
Param:   none
Return : List<String>
Returns list with all month names.
*/
    public static List<String> getMonth() {
        List<String> allMonth = new ArrayList<>();
        allMonth.add("January"); allMonth.add("Ferbruary"); allMonth.add("March");
        allMonth.add("April");allMonth.add("May");allMonth.add("June");allMonth.add("July");
        allMonth.add("August");allMonth.add("September");allMonth.add("October");
        allMonth.add("November");allMonth.add("December");
        return allMonth;
    }
}


