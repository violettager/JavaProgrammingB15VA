package day33_methods;

public class VoidMethodsPractice {
    public static void main(String[] args) {
        printDay(7);
        buildEmail("Veola Gerasimchuk","Google");
        checkEligible(655);
    }
    public static void printDay(int day){
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR! UNKNOWN DAY.");
        }
    }
    /*
    Method name: buildEmail
    Input/Params/Args: String name, String company
    - remove spaces from name and company
    - String email -> name@company.com
    -> print email
     */
    public static void buildEmail(String name,String company){
        name = name.replace(" ","");
        company = company.replace(" ", "");
        String email = name.toLowerCase()+"@"+company.toLowerCase()+".com";
        System.out.println(email);
    }
    public static void checkEligible(int creditScore){
        if(creditScore>=640){
            System.out.println("Your credit score is  = "+creditScore+", You are eligible for this loan");
        }else{
            System.out.println("Your credit score is  = "+creditScore+", You are not eligible for this loan");
        }
    }
}
