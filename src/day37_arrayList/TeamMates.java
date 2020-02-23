package day37_arrayList;

import java.util.*;

public class TeamMates {
    public static void main(String[] args) {
        ArrayList<String> teamMates = new ArrayList<>();
        teamMates.add("Olha");
        teamMates.add("Catalina");
        teamMates.add("Arman");
        teamMates.add("Lala");
        teamMates.add("Daniil");
        teamMates.add("Halime");
        teamMates.add("Juliza");
        teamMates.add("Mehmet");
        teamMates.add("Mirshod");
        teamMates.add("Mustafa");
        teamMates.add("Nijat");
        teamMates.add("Zulhayat");
        teamMates.add("Guljanat");
        teamMates.add("Akberet");

        System.out.println("Team size - " + teamMates.size());

        teamMates.add("Violetta"); // you can add value any time!

        System.out.println("Team size - " + teamMates.size());

        System.out.println("first person -" + teamMates.get(1) + ". |    and last person is - " + teamMates.get(teamMates.size() - 1));

        //print each value using for each loop.
        for (String eachPerson : teamMates) {
            System.out.println(eachPerson);
        }

        //print each value using regular for loop
        System.out.println();

        for (int i = 0; i < teamMates.size(); i++) {
            System.out.print(teamMates.get(i) + ", ");

        }
        System.out.println();

        //print each person in reverse order
        for (int j = teamMates.size() - 1; j >= 0; j--) {
            System.out.print(teamMates.get(j) + ", ");

        }
        System.out.println();
        //print two people at the time . Marufjon | Vasyl
        for (int i = 0; i < teamMates.size(); i += 2) {
            if (i == teamMates.size() - 1) {
                System.out.println(teamMates.get(i));
            } else {
                System.out.println(teamMates.get(i) + " | " + teamMates.get(i + 1));


            }


        }
        //Declare String allTeam and add everyone into that string
        //separated by -
        //Marufjon-Vasyl-Master Muhtar
        //print out allTeam
        String allTeam  = "";
        for(String eachPerson:teamMates){
            allTeam +=eachPerson+" - ";
            
        }
        allTeam = allTeam.substring(0,allTeam.length()-3);
        System.out.println("allTeam = " + allTeam);
    }
}
