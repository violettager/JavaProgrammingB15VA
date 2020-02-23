package b15officeHoursWithVasil;

public class Users2 {
    public static void main(String[] args) {
        //user_id, user_name, age, phone_number
        String[] users = {"1, John, 25, 243-342-2342",
                "2, Kevin, 34, 565-565-0000",
                "3, Paul, 50, 234-121-1111",
                "4, Mark, 42, 877-532-2342",
                "5, Trevor, 22, 234-222-8779",
                "6, Aeron, 50, 999-991-3453",
        };
        //we have to find out max age
        int maxAge = Integer.MIN_VALUE;
        for (String user : users) {
            int age = Integer.parseInt(user.split(", ")[2]);
            if (age > maxAge) {
                maxAge = age;
            }
        }
        String listOfOldestUsers = "";
        for (String user : users) {
            int age = Integer.parseInt(user.split(", ")[2]);
            if (maxAge == age) {
                listOfOldestUsers += user.substring(user.indexOf(", ") + 2,
                        user.lastIndexOf(",")) + "\n";
            }
        }
        System.out.println("List of oldest users:\n" + listOfOldestUsers);

    }
}
