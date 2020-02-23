package day57_exceptions2;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileNotFoundDemo {
    public static void main(String[] args) { //throws Exception
        System.out.println("before try catch");
        try {
            Files.readAllLines(Paths.get("file.txt"));
        } catch (IOException e) {
            System.out.println("exception found and caught!");
        }
        System.out.println("After try catch");
    }

}
