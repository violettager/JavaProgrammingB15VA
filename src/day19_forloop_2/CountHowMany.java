package day19_forloop_2;

public class CountHowMany {
    public static void main(String[] args) {
        String name = "java loops are fun";
        int count = 0;
        char myChar = 'a';
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)==myChar) {
                count++;
                System.out.println(myChar + " found at " + i);
            }

        }
            System.out.println("count : " + count);
            System.out.println("there are "+count+" ["+ myChar+"] "+"in our name");


        }
        }



