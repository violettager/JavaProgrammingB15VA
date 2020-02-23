package day06_operators;

public class ShortHandOperators {
    public static void main(String[] args){
        int cars = 15;
        System.out.println("Cars in parking lot: "+cars);
        cars = cars+2;
        System.out.println("Cars in parking lot: "+ cars);
        cars += 3;
        System.out.println("Cars in parking lot: "+cars);
        cars = cars-1;
        System.out.println("Cars in parking lot: "+cars);
        cars -=2;
        System.out.println("Cars in parking lot: "+cars);

        cars *=3;
        System.out.println("Cars in parking lot: "+cars);
        cars /=2;
        System.out.println("Cars in parking lot: "+cars);
        int carsBack = 20;
        cars += carsBack;
        System.out.println("Cars in parking lot: "+cars);

        int apples  = 10;
        apples --;
        System.out.println("apples left: "+apples);




    }
}
