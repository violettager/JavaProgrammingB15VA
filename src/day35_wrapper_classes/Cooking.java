package day35_wrapper_classes;

import java.util.Arrays;

public class Cooking {
    public static void main(String[] args) {
        scrambledEggsRecipe();
        System.out.println("~~DELICIOUS PASTA RECIPE~~");
        add("water");
        boil(1);
        add("salt", "spagetti", "olive oil");
        boil(10);
        System.out.println("pick up wooden spoon and ");
        mix(3);
        System.out.println("Enjoy your pasta!!!");

    }

    public static void scrambledEggsRecipe() {
        System.out.println("~~~~RECIPE FOR SCRAMBLED EGGS~~~~");
        add("oil", "eggs", "salt", "cheese");
        mix(60);
        boil(10);
        fry(3);
        bake(20);
        System.out.println("~~READY, ENJOY!~~");
    }

    public static void add(String... items) {
        System.out.println("Add - " + Arrays.toString(items));
    }

    public static void mix(int seconds) {
        System.out.println("  Mix for - " + seconds + " seconds!");
    }

    public static void boil(int minutes) {
        System.out.println("Boil for - " + minutes + " minutes!");
    }

    public static void fry(int minutes) {
        System.out.println(" Fry for - " + minutes + " minutes!");
    }

    public static void bake(int minutes) {
        System.out.println(" Bake for - " + minutes + " minutes!");

    }
}
