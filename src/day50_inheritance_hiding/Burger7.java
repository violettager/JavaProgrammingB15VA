package day50_inheritance_hiding;
import java.util.*;
public class Burger7 {
    public static void main(String[] args) {
        List<Ingredients> ingredients = new ArrayList<>();
        ingredients.add(new Ingredients("onion crisp",7));
        ingredients.add(new Ingredients("american cheese",120));
        ingredients.add(new Ingredients("pickles",10));
        ingredients.add(new Ingredients("lettuce",3));
        ingredients.add(new Ingredients("b7 sause",200));
        Burger b7Burger = new Burger("Cowboy ", ingredients);
        System.out.println(b7Burger.getIngredients().toString());
        System.out.println(b7Burger.toString());


    }
}
