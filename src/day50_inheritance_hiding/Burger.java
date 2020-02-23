package day50_inheritance_hiding;
import java.util.*;
public class Burger {
    private String name;
    private List<Ingredients> ingredients = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public Burger(String name, List<Ingredients> ingredients) {
        this.name = name;
        this.ingredients = ingredients;

    }

    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
