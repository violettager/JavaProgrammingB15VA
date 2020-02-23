package day26_arrays05;

public class Tools {
    public static void main(String[] args) {
        String[] tools = {"java","selenium","git","junit","jenkins","cucumber"};
        for (String eachTools:tools){
            if(eachTools.equals("java")){
                System.out.println(tools[0]+" =fun programming language");
            }else if(eachTools.equals("selenium")){
                System.out.println(tools[1]+" =test automation");
            }else if(eachTools.equals("git")){
                System.out.println(tools[2]+" =version control");
            }else if(eachTools.equals("junit")){
                System.out.println(tools[3]+" =testing tool");
            }else if(eachTools.equals("jenkins")){
                System.out.println(tools[4]+" =continious integration");
            }else if(eachTools.equals("cucumber")){
                System.out.println(tools[5]+" =BDD style testing");
            }


        }
    }

}
