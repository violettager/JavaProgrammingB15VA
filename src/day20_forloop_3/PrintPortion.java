package day20_forloop_3;

public class PrintPortion {
    public static void main(String[] args) {
        String str = "pizza, soup,chicken,kebab, shimp,  ice cream";
        for (int i = 0; i <str.length() -2; i++) {
             System.out.println(str.substring(i,i+3));

            }


        }
    }

