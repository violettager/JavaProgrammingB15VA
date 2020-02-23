package day18_do_While_Loop;

public class StartEnd {
    public static void main(String[] args) {

        int end =16;
        for(int start = 2;start<=end;start++){
            System.out.print(start+" ");
        }
        System.out.println();

        for(int num = 10; num>=1;num--){
            System.out.print(num+" "); //shortcut for run shift/control/r
        }
        System.out.println();
        int startNum = 40;
        int endNum = 25;
         if(startNum<endNum){
             for(int n = startNum; n<=endNum;n++){
                 System.out.print(n+" ");
             }
    }else{
             for(int n = startNum; n>= endNum;n--){
                 System.out.print(n+" ");
             }
         }
}}
