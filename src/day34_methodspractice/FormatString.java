package day34_methodspractice;
public class FormatString {
    public static void main(String[] args) {
        System.out.println(getNumberOfGoogleSearchResults("About 513,000,000 results (0.93 seconds)"));
        long cppResults=getNumberOfGoogleSearchResults("About 102,000,000 results (0.71 seconds)");
        System.out.println("cppResults = " + cppResults);
        repeatString("java",5,'*');
        System.out.println(repeatString1(" cats are funny ",10,'#'));


    }
    public static long getNumberOfGoogleSearchResults(String searchResults){
        String countOfRs = searchResults.split(" ")[1];//split and get index 1
        // System.out.println("countOfRs = " + countOfRs);
        //remove commas
        countOfRs=countOfRs.replace(",","");
        // System.out.println("countOfRs = " + countOfRs);
        //     "33432323333"
        long count = Long.parseLong(countOfRs); //convert string numbers into long
        return count;
    }
    public static void repeatString(String word,int times,char delimiter){
        for (int i = 0; i < times ; i++) {
            System.out.print(word+delimiter);
        }
        System.out.println();

    }
    public static String repeatString1(String word, int times, char delimiter){
        String word1="";
        for (int i = 1; i <=times ; i++) {
            word1+=word+delimiter;
        }
        return word1;
    }
}