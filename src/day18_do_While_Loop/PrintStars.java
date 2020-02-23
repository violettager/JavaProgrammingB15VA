package day18_do_While_Loop;

public class PrintStars {
    public static void main(String[] args) {
        for(int stars = 7;stars <=10;stars++){
            System.out.print("* ");
        }
        System.out.println();
        String myStars="";
        int starsCount = 9;

        for(int num  = 1;num<= starsCount;num+=2){
            myStars = myStars+"* ";


        }
        System.out.println(myStars);

    }

}
