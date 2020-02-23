package day49_overriding_final;

public class SearchEngine {
    public int search(String item){
        System.out.println("searching for... "+item+"\nreturning results count...");
        return item.length();
    }
    protected void getResults(){
        System.out.println("Search Engine displaying results...");
    }
    String clickResults(){
        System.out.println("Clicking results of search engine");
        return"SearchEngine item details";
    }
}
