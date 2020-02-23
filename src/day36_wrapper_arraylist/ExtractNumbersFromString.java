package day36_wrapper_arraylist;

public class ExtractNumbersFromString {
    public static void main(String[] args) {


        //declare String str = "java123is45fun0"
        //print all numbers from str
        String str = "java153is45fun0";
        String digits = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits += str.charAt(i);
            }

        }
        System.out.println("digits = " + digits);
        String str2 = "java153is4*5fun08701*&%^";
        String numbers = "";
        String letters = "";

        for (int i = 0; i < str2.length(); i++) {
            if (Character.isDigit(str2.charAt(i))) {
                numbers += str2.charAt(i);
            } else if (Character.isLetter(str2.charAt(i))) {
                letters += str2.charAt(i);
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("numbers = " + numbers);
        getAllNumbers(str);
    }

    public static Integer getAllNumbers(String str) {
        String nums = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                nums += str.charAt(i);
            }
        }
        if (nums.isEmpty()) {
            return 0;

        } else {
            return Integer.valueOf(nums);
        }
    }
}



