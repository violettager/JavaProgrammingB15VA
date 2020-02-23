package day21_forloop_4_arrayintro;

public class MultiplicationTableV2 {
    public static void main(String[] args) {
        int num = 2;

        for (int n = 1; n <= 10; n++) {
            System.out.println("MULTIPLICATION TABLE FOR  # " + n);
            System.out.println("--------------------------------");
            for (int i = 1; i <= 10; i++) {
                num++;
                int result = n * i;
                System.out.println(n + " x " + i + " = " + result);
            }
            System.out.println();
        }
    }
}
