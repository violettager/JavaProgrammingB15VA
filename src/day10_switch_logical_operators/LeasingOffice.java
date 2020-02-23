package day10_switch_logical_operators;

public class LeasingOffice {
    public static void main(String[] args) {
        System.out.println("Welcome to Cybertek Apartments!");
        int numberOfBedrooms = 1;
        double startingPrice = 0.0;

        switch (numberOfBedrooms) {
            case 0:
                System.out.println("Studio is selected");
                startingPrice = 1200.0;
                break;
            case 1:
                System.out.println("One bedroom is selected");
                startingPrice = 1400.0;
                break;
            case 2:
                System.out.println("Studio is selected");
                startingPrice = 1650.0;
                break;
            case 3:
                System.out.println("One bedroom is selected");
                startingPrice = 2200.0;
                break;
            default:
                System.out.println("no such apartment is available");
        }
        System.out.println("Starting price: $"+startingPrice);



        if(startingPrice>1300){
            System.out.println("too expensive!!!");
            System.out.println("I Am not signing the lease");
        }


    }


}
