package day12_ternary_string_manipulation;

public class AmazonNestedIf {
    public static void main(String[] args) {
        boolean isPrimeMember = true;
        double TotalPrice = 23.45;

        if (isPrimeMember) {
            System.out.println("Eligible for free shipping");
        } else {
            if (TotalPrice >= 25.0) {
                System.out.println("Eligible for free shipping");
            } else {
                System.out.println("not Eligible for free shipping");
            }

        }
    }

}

