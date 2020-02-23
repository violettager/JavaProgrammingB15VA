package day37_arrayList;
import java.util.*;
public class SortList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(100,45,200,1,-30,0));
        System.out.println("nums before sorting= " + nums);
        Collections.sort(nums);
        System.out.println("nums after sorting = " + nums);
        //Collections.sort(nums,Collections.reverseOrder());
        Collections.reverse(nums);
        System.out.println("nums after sorting reverse = " + nums);

        List<Character> characterList = new ArrayList(Arrays.asList('k','d','s','r','w','a','-'));
        System.out.println("characterList before sort= " + characterList);
        Collections.sort(characterList);
        System.out.println("characterList after sort= " + characterList);
        Collections.reverse(characterList);
        System.out.println("characterList after sorting reverse= " + characterList);
    }
}
