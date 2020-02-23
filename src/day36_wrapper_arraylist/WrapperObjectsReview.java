package day36_wrapper_arraylist;

import javax.print.DocFlavor;

public class WrapperObjectsReview {
    public static void main(String[] args) {
        // DECLARING AND CREATING WRAPPER CLASS OBJECTS:
        //
        // Boolean, Character, Byte, Short, Integer, Long, Float, Double.
        Boolean b1 = new Boolean(false);
        Boolean b2 = Boolean.valueOf(false);
        Boolean b3 = Boolean.valueOf("java");

        Character c1 = new Character('a');
        Character c2 = Character.valueOf('b');

        Byte by1 = new Byte((byte)10);
        Byte by2 = Byte.valueOf((byte)10);
        Byte by3 = Byte.valueOf("22");

        Short sh1 = new Short((short)100);
        Short sh2 = Short.valueOf((short)200);
        Short sh3 = Short.valueOf("300");

        Integer int1 = new Integer(1000);
        Integer int2 = Integer.valueOf(2000);
        Integer int3 = Integer.valueOf("3000");

        Long l1 = new Long(4000);
        Long l2 =Long.valueOf(5000);
        Long l3 =Long.valueOf("6000");

        Float f1 = new Float(23.5F);
        Float f2 = Float.valueOf(34.5F);
        Float f3 = Float.valueOf("34.5F");

        Double d1 = new Double(1000.2);
        Double d2 = Double.valueOf(97312.5);
        Double d3 = Double.valueOf("97312.5");









    }
}
