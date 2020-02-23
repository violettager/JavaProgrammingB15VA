package day14_String_Manipulation;

public class EtsyTitle {
    public static void main(String[] args) {
        String title = "wooden spoon | Etsy";
        if(title.startsWith("wooden spoon")&&title.contains("|")&& title.endsWith("Etsy")){
            System.out.println("test passed. Etsy title is correct");
        }else{
            System.out.println("test failed. Etsy title has bugs");
        }

    }
}
