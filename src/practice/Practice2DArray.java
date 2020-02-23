package practice;

public class Practice2DArray {
    public static void main(String[] args) {
        /*
        Warm up task:
Create a 2D int[] array called teamScores with 4 rows and 5 cols  each. Assign different numbers in 1-10 range
Each row represents score that team accumulated.
Loop through each team scores and find the team-row with highest score and print out details.
         */
        int[][] teamScores = {{2, 5, 7, 1, 1},
                {8, 9, 3, 6, 7},
                {8, 3, 3, 2, 7},
                {8, 9, 9, 1, 2}};
        int sum = 0;
        int winner = -1;

        for (int team = 0; team < teamScores.length; team++) {
            int sumTeam = 0;
            for (int col1 = 0; col1 < teamScores[team].length; col1++) {

                    sumTeam += teamScores[team][col1];

                }
                System.out.println("Team: " + team + " sum is - " + sumTeam);
            if(sumTeam>sum){
                sum = sumTeam;
                winner = team;
            }


            }
        System.out.println("winner Team is : " + winner + " and score is - " + sum);


        }


    }

