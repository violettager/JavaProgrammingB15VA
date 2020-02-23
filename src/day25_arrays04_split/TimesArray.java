package day25_arrays04_split;

public class TimesArray {
    public static void main(String[] args) {
        int[] time1 = {24, 55};
        int[] time2 = {24, 55};

        if (time1[1] > 60 || time1[0] >= 23) {
            System.out.println("invalid time");
        } else if (time2[1] > 60 || time2[0] >= 23) {
            System.out.println("invalid time");

        } else if (time1[0] < time2[0]) {
            System.out.println("time1 is earlier " + time1[0] + ":" + time1[1]);

        } else if (time1[0] > time2[0]) {
            System.out.println("time2 is earlier " + time2[0] + ":" + time2[1]);

        } else if (time1[1] > time2[1]) {
            System.out.println("time2 is earlier " + time1[0] + ":" + time1[1]);
        } else if (time1[1] < time2[1]) {
            System.out.println("time1 is earlier " + time1[0] + ":" + time1[1]);
        } else {
            System.out.println("time is the same");
        }
    }
}