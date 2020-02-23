package day59_exceptions_collection1.collectionsIntro;

import java.util.*;

public class LInkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        List<String> linkedList2 = new LinkedList<>();

        linkedList.add("java");
        linkedList.add("python");
        linkedList.add("c#");
        linkedList.add("c++");
        linkedList.addFirst("html");
        linkedList.addLast("javascript");

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());


    }
}
