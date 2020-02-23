package day16_memory_string_While_loop_intro;

public class StringPool {
    public static void main(String[] args) {
        String word1 = "java"; //string pool
        String word2 = "java"; //string pool re-use
        String word3 = new String ("java"); //outside pool,in heap
        System.out.println(word1==word2); //true. both are pointing to the same object
        System.out.println(word1==word3); // false. because word1 and word3 pointing to different object in memory.
        // when we use ==, it does not check if values are matching
        //it only checks if variables are pointing to same object in memory,
        String word4  = new String ("java"); //outside pool. in heap
        //checks if word3 and word4 are pointing to same object
        System.out.println(word3==word4); //false. different objects in memory.
        String word5 = word4; //point to same project as word4
        System.out.println(word5==word4); //true. they are pointing to the same object.
    }
}
