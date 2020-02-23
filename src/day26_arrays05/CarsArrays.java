package day26_arrays05;

public class CarsArrays {
    public static void main(String[] args) {


        String[] myCars = {"Ford", "Chevy", "Toyota", "Honda", "Mazda", "Kia", "Hyundai", "BMW", "Audi"
                , "Mercedes", "Fiat", "Ferrari", "Alpha Romeo", "Bugatti", "Renault","Zaporozhets"};
        for (int i = 0; i <myCars.length ; i++) {
            if(myCars[i].equals("Ford")|| myCars[i].equals("Chevy")){
                System.out.println(myCars[i]+" - is an american car");
            }else if(myCars[i].equals("Toyota")|| myCars[i].equals("Honda")||myCars[i].equals("Mazda")){
                System.out.println(myCars[i]+" - is Japanese car ");
            }else if(myCars[i].equals("Kia")|| myCars[i].equals("Hyundai")){
                System.out.println(myCars[i]+" - is Korean car");
            }else if(myCars[i].equals("BMW")|| myCars[i].equals("Audi")||myCars[i].equals("Mercedes")){
                System.out.println(myCars[i]+" - is German car");
            }else if(myCars[i].equals("Fiat")|| myCars[i].equals("Ferrari")||myCars[i].equals("Alpha Romeo")){
                System.out.println(myCars[i]+" - is an Italian car");
            }else if(myCars[i].equals("Bugatti")|| myCars[i].equals("Renault")){
                System.out.println(myCars[i]+" - is French car");

            }else{
                System.out.println(myCars[i]+" - is UNKNOWN CAR");
            }


        }

    }}
