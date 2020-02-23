package HomeWork;
import java.util.*;
public class HashMapPractice {
    public static void main(String[] args) {
        //declare hashmap
        Map rawMap = new HashMap();
        rawMap.put(123,12354);
        rawMap.put(true,false);
        rawMap.put("key","value");
        rawMap.put("potatoes",7.0);
        System.out.println(rawMap);

        //declare polymorphic Map<Integer,String>
        Map<Integer,String> employees = new HashMap<>();
        HashMap<Integer,List<String>> empMap = new HashMap<>();
        List<Map<Integer,String>> list = new ArrayList<>();

        employees.put(11,"Wali");
        employees.put(22,"Nijat");
        employees.put(33,"Yassine");
        employees.put(44,"Amir");
        employees.put(55,"Luba");
        employees.put(66,"May");
        employees.put(77,"Imad");
        employees.put(88,"Nassif");
        System.out.println(employees.get(77));
        int id = 22;
        System.out.println(id+" - "+employees.get(id));
        System.out.println(employees.get(100));//null

        //amir out- tahmina id 44
        employees.replace(44,"Tahmina");
        id = 44;
        System.out.println(id+" - "+employees.get(id)); //Tahmina

        System.out.println("------size() method------");
        System.out.println(employees.size());
        System.out.println("------remove(key) method------");
        employees.remove(11);
        System.out.println(employees.toString());
        System.out.println();
        System.out.println(employees.size()+"--- size---");
        System.out.println();
        System.out.println("----contains(key) method-----");
        System.out.println(employees.containsKey(77));
        System.out.println(employees.containsKey(10));
        System.out.println();
        System.out.println("----containsValue(value) method-----");
        System.out.println(employees.containsValue("May")); //true
        System.out.println(employees.containsValue("Nadir")); //false
        System.out.println();
        System.out.println("----isEmpty() method-----");
        System.out.println(employees.isEmpty()); //false
        System.out.println();
        System.out.println("----keySet() method-----");
        System.out.println(employees.keySet()); //true
        Set<Integer>empIDs = employees.keySet();
        System.out.println("empIDs = " + empIDs);

        System.out.println("----values() method----");
        System.out.println(employees.values());
        Collection <String> empNames = employees.values();
        System.out.println("empNames = " + empNames);





    }
}
