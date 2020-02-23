package day22_arrays_intro;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] items = {5,6,8,10};
        double[] price= {5.99,6.44,8.77,10.15};
        for(int eachItem:items){
            System.out.print(eachItem+" | ");

        }
        System.out.println();
        for(double eachPrice:price){
            System.out.print(eachPrice+" | ");
        }

    }

}
