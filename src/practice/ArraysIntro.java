package practice;

public class ArraysIntro {
    public static void main(String[] args) {
        String students[] = {"kevin","michael","kate","zoya","violet"};
        System.out.println(students[1]);
        System.out.println(students.length);
        for(String eachStudent:students){
            System.out.print(eachStudent);
        }

    }
}
