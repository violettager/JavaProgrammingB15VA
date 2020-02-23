package day26_arrays05;

public class CanvasURL {
    public static void main(String[] args) {
        String url = "www.learn.cybertekschool.com/courses/288/modules";
        // declare string array and with 4 items and assign values
        String []urlArr = new String[4]; //0,1,2,3
        urlArr [0]  = "www.learn.cybertekschool.com";
        urlArr [1]  = "courses";
        urlArr [2]  = "288";
        urlArr [3]  = "modules";

       String[]splitUrArr =  url.split("/");
       //for loop:
        System.out.println("length: "+splitUrArr.length);
        for (int i = 0; i <splitUrArr.length ; i++) {
            System.out.println(splitUrArr[i]);

        }
        //for each loop - arrays and other collections. To iterate one by one
        for (String eachArray : splitUrArr) {
            System.out.println(eachArray);//doesn't need anything else
        }
        //declare 4 variables, baseUrl, resource, id, target
        // and assign values from the array indexes
        String baseUrl = splitUrArr[0];
        String resource = splitUrArr[1];
        String id = splitUrArr[2];
        String target = splitUrArr[3];
        System.out.println("baseUrl = " + baseUrl);
        System.out.println("resource = " + resource);
        System.out.println("id = " + id);
        System.out.println("target = " + target);

        /*
        Check the id and print course name, using conditional statements.
        Switch statement
        288 -> Java programming
        287 -> Interview preparation
        286 -> API Testing
        289 -> QA Testing
        290 -> Review Sessions
        -> Unknown Course
         */

        switch(id){
            case "288":
                System.out.println("Java programing");
                break;
            case "287":
                System.out.println("interview preparation");
                break;
            case "286":
                System.out.println("API testing");
                break;
            case"289":
                System.out.println("QA testing");
                break;
            case"290":
                System.out.println("Review sessions");
                break;

        }
        System.out.println("CODE EXECUTION COMPLETED!");





    }
}
