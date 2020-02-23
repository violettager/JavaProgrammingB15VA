package day26_arrays05;

import java.util.Arrays;

public class PopularNames {
    public static void main(String[] args) {
        String[] names = {"James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda",
                "William", "Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica",
                "Thomas", "Sarah", "Charles", "Margaret", "Christopher", "Karen",
                "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald", "Dorothy",
                "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna",
                "Kenneth", "Emily", "George", "Carol", "Joshua", "Michelle",
                "Kevin", "Amanda", "Brian", "Melissa", "Edward", "Deborah",
                "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura",
                "Jeffrey", "Helen", "Ryan", "Sharon", "Jacob", "Cynthia",
                "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley",
                "Stephen", "Angela", "Jonathan", "Anna", "Larry", "Ruth",
                "Justin", "Brenda", "Scott", "Pamela", "Brandon", "Nicole", "Frank", "Katherine",
                "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine", "Samuel", "Virginia",
                "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
                "Jerry", "Carolyn",
                "Tyler", "Maria",
                "Aaron", "Heather",
                "Henry", "Diane",
                "Jose", "Julie",
                "Douglas", "Joyce",
                "Peter", "Evelyn",
                "Adam", "Joan",
                "Nathan", "Victoria",
                "Zachary", "Kelly",
                "Walter", "Christina",
                "Kyle", "Lauren",
                "Harold", "Frances",
                "Carl", "Martha",
                "Jeremy", "Judith",
                "Gerald", "Cheryl",
                "Keith", "Megan",
                "Roger", "Andrea",
                "Arthur", "Olivia",
                "Terry", "Ann",
                "Lawrence", "Jean",
                "Sean", "Alice",
                "Christian", "Jacqueline",
                "Ethan", "Hannah",
                "Austin", "Doris",
                "Joe", "Kathryn",
                "Albert", "Gloria",
                "Jesse", "Teresa",
                "Willie", "Sara",
                "Billy", "Janice",
                "Bryan", "Marie",
                "Bruce", "Julia",
                "Noah", "Grace",
                "Jordan", "Judy",
                "Dylan", "Theresa",
                "Ralph", "Madison",
                "Roy", "Beverly",
                "Alan", "Denise",
                "Wayne", "Marilyn",
                "Eugene", "Amber",
                "Juan", "Danielle",
                "Gabriel", "Rose",
                "Louis", "Brittany",
                "Russell", "Diana",
                "Randy", "Abigail",
                "Vincent", "Natalie",
                "Philip", "Jane",
                "Logan", "Lori",
                "Bobby", "Alexis",
                "Harry", "Tiffany",
                "Johnny", "Kayla"};
        System.out.println("names.length = " + names.length);
        System.out.println(Arrays.toString(names));
        int sarahsIndex = -1; // assign -1. this value will stay, in case not found
        //loop through the names 
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Sarah")) {
                sarahsIndex = i;
                System.out.println("Sarah's index is =  " + sarahsIndex);

            }

        }
        System.out.print("male names  = ");
        for (int j = 0; j < names.length - 2; j += 2) {
            System.out.print(names[j] + ", ");
        }
        System.out.println();
        System.out.print("Female names = ");
        for (int i = 1; i < names.length - 2; i += 2) {
            System.out.print(names[i] + ", ");

        }
        System.out.println();
        //solve above task using a single loop
        String maleName = "";
        String femaleName = "";
        for (int i = 0; i < names.length; i++) {
            if (i % 2 == 0) {
                maleName += names[i] + ", ";
            } else {
                femaleName += names[i] + ", ";
            }
        }
        System.out.println();
        System.out.println("Male names = " + maleName);
        System.out.println("Female names = " + femaleName);
        if (maleName.contains("David")) {
            System.out.println("David is on the list");
        } else {
            System.out.println("there is no David on the list");
        }
        if (femaleName.contains("Susan")) {
            System.out.println("Susan is on the list");
        } else {
            System.out.println("there is no Susan on the list");
        }
        // find the person with longest name

        String longestName = "";
        String shortestName = names[0];
        for (int i = 0; i < names.length; i++) {
            if (names[i].length()>longestName.length()) {
                longestName = names[i];

            }
            if(names[i].length()<shortestName.length()){
                shortestName = names[i];
            }



        }
        System.out.println("longest name in the list is  = "+longestName+" and it has "+longestName.length()+" leters");
        System.out.println("shortest name in the list is  = "+shortestName+" and it has "+shortestName.length()+" leters");


    }
}
