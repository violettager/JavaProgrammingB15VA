package day23_arraysday2;

public class StudentsList {
    public static void main(String[] args) {
       String[] students = {"Violetta", "Tahmina", "Aika", "Edil", "Katya", "Irma", "hilal", "Zhumgalbek", "Murodil"};
        String[] students2 = new String[9];
        students2[0] = "Violetta";
        students2[1] = "Tahmina";
        students2[2] = "Aika";
        students2[3] = "Edil";
        students2[4] = "Katya";
        students2[5] = "Irma";
        students2[6] = "Hilal";
        students2[7] = "Zhumgalbek";
     students2[8] = "Murodil";
        //print students count
        //"Total students: 9"
        System.out.println("Total students: " + students.length);
        //print first student:
        System.out.println("First student : " + students[0]);
        System.out.println(students[0].toUpperCase());
        //using For loop print.
        //Edilbek >> 7
        //Aika >> 4
        //Tahmina >> 7
        //..
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i] + " >> " + students[i].length());
        }
        //for each loop :
        for (String friend : students) {
            System.out.println(friend + " >> " + friend.length());
        }

        String friend1 = students[0];
        System.out.println("friend1 = " + friend1);
        //for each loop :
        //declare counter and set to 0
        int counter = 0;
        for (String friend : students) {
            System.out.println(counter + ". " + friend + " >> " + friend.length());
            //increment ++
            counter++;
        }
        String allFriends = "";//Edil, Aika ..

        for (String friend : students) {
            allFriends += friend + ", ";
        }
        //remove last ", "
        allFriends = allFriends.substring(0, allFriends.length() - 2);
        System.out.println("allFriends = " + allFriends);

        //
        for (int i = 0; i < students.length; i += 2) {
            System.out.println("i: " + i);
            if (i == students.length - 1) { //check if i is at last index
                System.out.println(students[i]);

            } else {
                System.out.println(students[i] + ", " + students[i + 1]);

            }
            //0 [1] 2 [3] 4 [5] 6 [7] 8


        }


    }
}
