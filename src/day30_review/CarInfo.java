package day30_review;
import java.util.*;
public class CarInfo {
    public static void main(String[] args) {
        
        //MINI-Cooper-->MINI-******
        //Infinity - qx56-->Infinity - ****
        //split or use substring and get make and model 
        //count number of chars in model and using a loop build that many stars
        String car = "MINI-0984";
        String[] carsSplit = car.split("-");

        String make =carsSplit[0];
        String model = carsSplit[1];
        String carModelMasked = "";
        String stars = "";


        System.out.println(car.split("-")[0] );
        for (int i = 1; i <=model.length(); i++) {
            stars+="*";
            carModelMasked =stars;




        }
        System.out.println(make+"-"+carModelMasked);



        
    }
}
