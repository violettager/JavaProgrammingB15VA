package day41_encapsulation;

public class Recipe {
    String Ingredient1;
    String Ingredient2; //Properties
    String Ingredient3;
    String Ingredient4;
    String Ingredient5;
    int mix;
    int bake;
                              //METHOD GIVING ACTION TO OUR OBJECT
    public void ApplePie(String ingredient1_value,String ingredient2_value,String ingredient3_value,int mix1_value,int bake1_value) {
        Ingredient1 = ingredient1_value;
        Ingredient2 = ingredient2_value;
        Ingredient3 = ingredient3_value;
        mix = mix1_value;
        bake = bake1_value;
        System.out.println("------------Apple Pie recipe----------");
        System.out.println("To make an apple you have to mix these ingredients: " + ingredient1_value + ", " + ingredient2_value + ", " + ingredient3_value + ".");
        System.out.println("you have to mix it in a bowl for: "+mix1_value+" minutes \n and bake for "+bake+" minutes."+"\n ENJOY YOUR PIE!!!");


    }
    public void chickenPie(String ingredient1_value,String ingredient2_value,String ingredient3_value,String ingredient4_value,String ingredient5_value,int mix1_value,int bake1_value){
        Ingredient1 = ingredient1_value;
        Ingredient2 = ingredient2_value;
        Ingredient3 = ingredient3_value;
        Ingredient4 = ingredient4_value;
        Ingredient5 = ingredient5_value;
        mix = mix1_value;
        bake = bake1_value;
        System.out.println("-------------Chicken Pie----------------");
        System.out.println("To make a chicken pie you need to get these ingredients: -"+ ingredient1_value + ", " + ingredient2_value + ", " + ingredient3_value +", "+ ingredient4_value + ", " + ingredient5_value + "."
        +" Then mix together for "+mix1_value+" minutes and then put in in oven for - "+bake1_value+" minutes. \n If you want to put more "+ingredient1_value+" please do!");
    }
}
