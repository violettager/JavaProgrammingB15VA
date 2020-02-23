package day60_collections2;
import java.util.*;
public class SortingALIst {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("js");
        list.add("html");
        list.add("ruby");
        list.add("python");
        list.add("kotlin");
        list.add("A++");
        System.out.println("------Before Sorting------");
        System.out.println(list.toString());

        Collections.sort(list);
        System.out.println("------After Sorting------");
        System.out.println(list.toString());

        List<Product> prodList = new ArrayList<>();
        prodList.add(new Product("wooden spoon",12.99));
        prodList.add(new Product("computer bag",105.99));
        prodList.add(new Product("shoes",54.99));
        prodList.add(new Product("bmw 525i",2700.99));
        prodList.add(new Product("macbook pro",1499.99));
        System.out.println("---------prod before sorting----------");
        System.out.println(prodList.toString());
        Collections.sort(prodList);
        System.out.println("---------prod after sorting----------");
        System.out.println(prodList.toString());


    }
}
