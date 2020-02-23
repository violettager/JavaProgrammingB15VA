package day15_string_manipulation;

public class StringReplace {
    public static void main(String[] args) {
        String words = "sad, cry, python";
        System.out.println(words.replace("sad","happy"));
        System.out.println(words.replace("cry","smile"));
        System.out.println(words.replace("python","java"));
       words=  words.replace("sad","happy");
        words = words.replace("cry","smile");
       words =  words.replace("python","java :)");
       words = words.replace("happy","sad").replace("smile","cry").replace("java","python");
        System.out.println("words = " + words);
        
        String capital = "London is capital of UK";
        capital = capital.replace("London","Kiev").replace("UK","Ukraine");
        System.out.println("capital = " + capital);
    }
}
