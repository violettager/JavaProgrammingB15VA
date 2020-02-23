package day58_exceptions3;

import java.net.*;

public class TryCatchFinally {
    public static void main(String[] args) {

        try {
            System.out.println("in try block...");
            URL etsyURL = new URL("www.etsy.com");
            System.out.println("end of try block");
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException caught and handled...");
            System.out.println("reason: " + e.getMessage());

        } finally {
            System.out.println("finally block  - runs always");
        }

        try {
            System.out.println("in 2nd try block...");
            int num = Integer.parseInt("32048lg");
            System.out.println("end of second try block...");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException was caught and handled..");
            System.out.println("getMessage: " + e.getMessage());
            System.out.println("getCause: " + e.getCause());

        } finally {
            System.out.println("2nd Finally block. Runs All the time...");
        }
        System.out.println("after 2nd try catch finally..");

    }
}
