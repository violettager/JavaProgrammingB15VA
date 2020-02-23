package day21_forloop_4_arrayintro;

public class ReadyByPortionPractice {
    public static void main(String[] args) {
        String str = "java, github username, javajava, python, automation java tools, java is most popular";
        System.out.println(str.substring(0,1)); //j
        System.out.println(str.substring(1,2)); //a
        int i = 0;
        System.out.println(str.substring(i,i+1)); //j
        i++;
        System.out.println(str.substring(i,i+1)); //a
        i = 0;
        System.out.println(str.substring(i,i+2)); //ja
        i++;
        System.out.println(str.substring(i,i+2)); //av
        i = 0;
        System.out.println(str.substring(i,i+3));


        for (int j = 0; j <str.length() ; j++) {
            System.out.println(str.substring(j,j+1)+" ");

        }
        for (int j = 0; j <str.length()-1 ; j++) {
            System.out.println(str.substring(j,j+2)+" ");

        }

        for (int j = 0; j <str.length()-3 ; j++) {
            String temp = str.substring(j,j+4);
            //System.out.println(str.substring(j,j+4)+" ");
            if(temp.equals("java")){

                System.out.println("java found! Lets code it!");
            }

        }


    }
}
