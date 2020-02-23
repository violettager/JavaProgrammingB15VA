package day20_forloop_3;

public class NeighborsMatchingLettersBeep {
    public static void main(String[] args) {
        String str = "jaaavvaaaa loopps";
        for (int i = 0; i <str.length() -1; i++) {
           // System.out.println(str.charAt(i)+""+ str.charAt(i+1));
            if(str.charAt(i)==str.charAt(i+1)){
                System.out.println("beep - "+str.charAt(i));
            }


        }


        }
    }

