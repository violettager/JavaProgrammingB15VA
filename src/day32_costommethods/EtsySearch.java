package day32_costommethods;

public class EtsySearch {
    public static void main(String[] args) {
        /*
        openBrowser
navigateToEtsy
searchForWoodenSpoon
printResults

openBrowser:
"Click on Chrome icon"

navigateToEtsy:
"Type etsy.com to address bar"
"Click on Enter"

searchForWoodenSpoon:
"Type wooden spoon into search field"
"Click on search icon"

printResults:
"Total results: wooden spoon (14,581 Results)"

         */
        openBrowser();
        navigateToetsy();

        navigateToEtsy();
        searchForWoodenSpoon();
        printResults();
    }
    public static void openBrowser(){
        System.out.println("----------------------");
        System.out.println("Click on Chrome icon");

    }
    public static void navigateToetsy(){
        System.out.println("----------------------");
        System.out.println("searchForWoodenSpoon");
        System.out.println("printResults");
    }

    public static void navigateToEtsy(){
        System.out.println("----------------------");
        System.out.println("Type etsy.com to address bar");
        System.out.println("Click on Enter");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("----------------------");
        System.out.println("Type wooden spoon into search field");
        System.out.println("Click on search icon");
    }
    public static void printResults(){
        System.out.println("----------------------");
        System.out.println("Total results: wooden spoon (14,581 Results)");

    }
}
