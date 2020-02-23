package day17_while_do_while_loop;

public class JumpingMonkey {
    public static void main(String[] args) {


        int monkeyCount = 5;
        while (monkeyCount >= 1){
            System.out.println(monkeyCount+" little monkeys jumping on the bed,\n" +
                    "One fell down and bumped his head,\n" +
                    "Mama called the doctor and the doctor said,\n" +
                    "No more monkeys jumping on the bed!");
            monkeyCount--;


        }
        System.out.println("Put those monkeys right to bed!");
        //

    }
}