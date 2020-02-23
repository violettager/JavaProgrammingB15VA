package day35_wrapper_classes;

public class ApartmentLease {
    public static void main(String[] args) {
        applyForApartment(677);

    }
    public static void qualify(){
        System.out.println("Congratulations, your application for apartment is approved!");

    }
    public static void notQualify(){
        System.out.println("Unfortunately, your application for apartment is denied!");
    }


    public static void applyForApartment(int creditScore){
        if(creditScore>=650&& creditScore<=850){
            qualify();
        }else{
            notQualify();
        }
    }
}
