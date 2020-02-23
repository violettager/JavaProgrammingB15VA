package day29_StringManipulationReview;

public class EmployeesData {
    public static void main(String[] args) { 
        String str = "Phil Salt [SDET] psalt@g.co ";
        int n1 = str.indexOf("["); //10
        int n2 = str.indexOf("]"); //15
        System.out.println("n1 = " + n1);
        String job = str.substring(n1+1,n2);
        System.out.println("job = " + job);
        System.out.println("job is = "+str.substring(str.indexOf("[")+1,str.indexOf("]")));

        String firstName = str.substring(0,str.indexOf(" "));
        System.out.println("firstName = " + firstName);
        String lastName = str.substring(str.indexOf(" ")+1,str.indexOf(" ["));
        System.out.println("lastName = " + lastName);
        // how to look for second space
        int end = str.indexOf(" ",str.indexOf(" ")+1);
        System.out.println("end = " + end);
        String Lastname = str.substring(str.indexOf(" ")+1,end);
        System.out.println("Lastname = " + Lastname);
        int third = str.indexOf(" ", str.indexOf(" ", str.indexOf(" ")+1 )+1);
        System.out.println("third = " + third);

        String[] arraySplit = str.split(" ");
        String firstname = arraySplit[0];
        String lastname = arraySplit[1];
        System.out.println("first name = "+firstname);
        System.out.println("last name = "+lastname);

        String firstName4 = str.split(" ")[0];
        System.out.println("firstName4 = " + firstName4);
        
        
    }
}
