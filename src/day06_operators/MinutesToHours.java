package day06_operators;

public class MinutesToHours {
    public static void main(String[] args){
        int minutes = 135;
        int hours = minutes/60;
        System.out.println(hours);
        int remainingMinutes = minutes%60;
        System.out.println(remainingMinutes);
        //2 hours and 15 minutes
        System.out.println(hours +" hours "+remainingMinutes+" minutes");

    }
}
