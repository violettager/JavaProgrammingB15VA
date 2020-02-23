package day22_arrays_intro;

public class Cities {
    public static void main(String[] args) {
        String[] cities = {"Chicago","Ankara","Dubai","Baku","Tashkent"};
        for (String eachCity:cities){
            System.out.println(eachCity+" |"+" \nin capital letters "+eachCity.toUpperCase());

        }
        System.out.println();
        for(String eachLetter:cities){
            if(eachLetter.length()>5){ //longer than 5 digits.
                System.out.println("longer than 5 digits - "+eachLetter);
            }
            
        }
        System.out.println();
        for(String tahmiNa:cities){
            if(tahmiNa.contains("i")){
                System.out.println("contains letter i - "+tahmiNa);

            }
        }
    }
}
