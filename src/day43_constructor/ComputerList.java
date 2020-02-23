package day43_constructor;
import java.util.*;
public class ComputerList {
    public static void main(String[] args) {
        //declare LIST OF cOMPUTERS
        List<Computer> compList = new ArrayList<>();
        compList.add(new Computer("HP 14", "Win 10", 219.99));
        Computer c = new Computer("Dell inspiron", "Win11", 419.99);
        compList.add(c);
        compList.add(new Computer("Sony Vio", "Win 12", 819.99));
        compList.add(new Computer("HP 25", "Win 7", 729.99));
        compList.add(new Computer("Macbook Pro 13", "MacOs Caalina", 1829.99));
        compList.add(new Computer("Lenovo 44", "win11", 2009.99));
        //Task1. Print number of computers
        System.out.println("==========Task 1=========");
        System.out.println("Number of computers: " + compList.size());
        //Task 2.Print first computer brand and price
        System.out.println("==========Task 2 First Computer =========");
        System.out.println(compList.get(0).getBrand());
        System.out.println(compList.get(0).getPrice());
        //another way
        Computer firstComp = compList.get(0);
        System.out.println(firstComp.getBrand());
        System.out.println(firstComp.getPrice());
        //Task 3. using FOR loop. Print number then Computer description
        //System.out.println(firstComp.toString());
        System.out.println("==========Task 3 ToString for all Computer =========");
        for (int i = 0; i < compList.size(); i++) {
            System.out.println(i + 1 + ". " + compList.get(i));//or add .toString();
        }
        //TASK 4 . using FOR EACH loop. Print number them Computer Description
        System.out.println("==========Task 4 ToString for all Computer =========");
        int counter = 1;
        for (Computer eachComp : compList) {
            System.out.println(counter + ". " + eachComp);
            counter++;
        }
        //Task 5. Print Brand and Price for computers within your budget
        System.out.println("=====Task 5 Print brand and price for computers within your budget =========");
        double myBudget = 800.0;
        for (int i = 0; i < compList.size(); i++) {
            if (compList.get(i).getPrice() <= 800) {
                System.out.println(compList.get(i).getPrice() + "|" + compList.get(i).getBrand());
            }
        }
        //Task 6. Calculate Total Price for all Computers
        System.out.println("==========Task 6=========");
        double sum = 0;
        for (int i = 0; i < compList.size(); i++) {
            sum += compList.get(i).getPrice();
        }
        System.out.println("sum = " + sum + "$");
        //Task 7. Print information of the most expensive computer
        System.out.println("==========Task 7=========");
        double max = 0;
        for (int i = 0; i < compList.size(); i++) {
            if (compList.get(i).getPrice() > max) {
                max = compList.get(i).getPrice();
            }
        }
        System.out.println("maximum price = " + max);
        //Task 8. Print information of the least expensive computer
        System.out.println("==========Task 8=========");
        double min = compList.get(0).getPrice();
        for (int i = 0; i < compList.size(); i++) {
            if (compList.get(i).getPrice() < min) {
                min = compList.get(i).getPrice();
            }
        }
        System.out.println("minimum price computer " + min + "$");
        //Task 9. 50% off for all computers then print ToString for all of them
        System.out.println("==========Task 9=========");
        for (int i = 0; i < compList.size(); i++) {
            //compList.set(i, compList.get(i).getPrice()/2);
        }
    }}

