package day31_multidArray;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        String[][] list = new String[4][3];
        //add vegetables
        list[0][0] = "Potatoes";
        list[0][1] = "Carrots";
        list[0][2] = "Onions";
        //add fruits
        list[1][0] = "apples";
        list[1][1] = "kiwi";
        list[1][2] = "figs";
        //add dairy
        list[2][0] = "milk";
        list[2][1] = "eggs";
        list[2][2] = "cheese";
        //add bread products
        list[3][0] = "bread";
        list[3][1] = "bagel";
        list[3][2] = "muffin";
        System.out.println(list[0][0]+", "+list[0][1]+", "+list[0][2]);
        System.out.println(list[1][0]+", "+list[1][1]+", "+list[1][2]);
        System.out.println(list[2][0]+", "+list[2][1]+", "+list[2][2]);
        System.out.println(list[3][0]+", "+list[3][1]+", "+list[3][2]);

        System.out.println(Arrays.deepToString(list));
        String fruit  = list[1][1];
        System.out.println("fruit = " + fruit);

        //lets find out how many arrays in the 2d array
        System.out.println("number of arrays/rows: "+list.length);
        //how many vegetables
        System.out.println("number of vegetables: "+list[0].length);
        System.out.println("number of fruits: "+list[1].length);
        System.out.println("number of dairy: "+list[2].length);
        System.out.println("number of breads: "+list[3].length);
        
        // how to print using a loop
        // print all vegetables using a loop
        System.out.println();
        System.out.println("Vegetables");
        System.out.println("--------------");
        for (int i = 0; i <list[0].length ; i++) {
            System.out.println("list[0][i] = " + list[0][i]);
            
        }
        System.out.println();
        System.out.println("Bakery!");
        System.out.println("--------------");
        //print all bakery items
        for (int i = 0; i <list[3].length ; i++) {
            System.out.println("list[3][i] = " + list[3][i]);
            
        }
        System.out.println();
        System.out.println("Dairy");
        System.out.println("---------------");
        for(String each:list[2]) {
            System.out.println("list[3] : " + each);
        }



            //print all items using nested for loop
            for (int i = 0; i < list.length; i++) {
                System.out.println("row : "+i);
                for (int j = 0; j < list[i].length; j++) {
                    System.out.print(" Col : "+j+" - ");
                    System.out.println(list[i][j]);

                }
                System.out.println();

            }

        }

    }

