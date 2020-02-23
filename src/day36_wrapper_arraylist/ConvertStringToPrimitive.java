package day36_wrapper_arraylist;

public class ConvertStringToPrimitive {
    public static void main(String[] args) {
        // Boolean, Character, Byte, Short, Integer, Long, Float, Double.
        boolean b1 = Boolean.parseBoolean("true");
        char ch = "a".charAt(0);
        byte byteValue = Byte.parseByte("100");
        short shortValue = Short.parseShort("10000");
        int intValue = Integer.parseInt("346634");
        long longValue = Long.parseLong("8493208489438294832");
        float floatValue = Float.parseFloat("2389283.32");
        double doubleValue = Double.valueOf("233345.66");
        String strPrice = "234.5";
        double doublePrice = Double.parseDouble(strPrice);
        System.out.println("b1 = " + b1);
        System.out.println("ch = " + ch);
        System.out.println("byteValue = " + byteValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("doublePrice = " + doublePrice);
        if (doublePrice > 155.0) {
            System.out.println("OutOfBudgetException");
        } else {
            System.out.println("Lets buy it!");

        }
    }
}
