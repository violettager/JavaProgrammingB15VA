package day37_arrayList;
import java.util.*;
public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        //check if list is Empty
        System.out.println("shoppingList.isEmpty() = " + shoppingList.isEmpty());
        //another way
        System.out.println("(shoppingList.size()==0) = " + (shoppingList.size()==0));
        //another way
        if(shoppingList.isEmpty()){
            System.out.println("shopping list is empty!");
        }else{
            System.out.println("shopping list is not empty!");
        }
        System.out.println("----------------------------");

        shoppingList.add("apple laptop");
        shoppingList.add("tesla");
        shoppingList.add("sport shoes");
        shoppingList.add("t-shirt");
        shoppingList.add("jacket");
        shoppingList.add("hat");
        shoppingList.add("wooden-spoon");

        if(shoppingList.isEmpty()){
            System.out.println("shopping list is empty!");
        }else{
            System.out.println("shopping list is not empty!");
        }
        
        //get count and assign into variable count
        int count = shoppingList.size();

        // check if jacket on the list
        System.out.println("count = " + count);
        System.out.println(shoppingList.contains("jacket"));
        if(shoppingList.contains("jacket")){
            System.out.println("Shopping list contains jacket");
        }else{
            System.out.println("Shopping list do not contain jacket");
        }

        System.out.println("contains 5  - "+shoppingList.contains(5));

        //find index of "tesla","apple laptop","hat"
        System.out.println("tesla index  - "+shoppingList.indexOf("tesla"));
        System.out.println("apple laptop index  - "+shoppingList.indexOf("apple laptop"));
        System.out.println("hat index  - "+shoppingList.indexOf("hat"));
        System.out.println("break index  - "+shoppingList.indexOf("break"));


        //remove everything
        shoppingList.clear();
        System.out.println("shoppingList = " + shoppingList);

        }

    }

