package day21_forloop_4_arrayintro;

public class FIndUniqueChars {
    public static void main(String[] args) {
        String str = "jaavaa";
        String unique = ""; //jav
        //loop from beginning until end of str
        for(int n  = 0; n <str.length(); n++){
            String temp = str.charAt(n)+"";
           // System.out.println("temp = "+temp);
            if(!unique.contains(temp)){
                unique+=temp;
                System.out.println("unique = "+unique);
            }


        }


    }


}
