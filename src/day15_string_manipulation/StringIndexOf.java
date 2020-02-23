package day15_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String technologies = "java,c++,python,tomcat,aws";
        System.out.println(technologies.indexOf("java"));
        int java, c, python, tomcat, aws;
        java = technologies.indexOf("java");
        c = technologies.indexOf("c");
        python = technologies.indexOf("python");
        tomcat = technologies.indexOf("tomcat");
        aws = technologies.indexOf("aws");
        System.out.println("java = "+java);
        System.out.println("c = "+c);
        System.out.println("python = "+python);
        System.out.println("tomcat = "+tomcat);
        System.out.println("aws = "+aws);

        //technologies ->how can i check if "c++" is in the technologies String.
        //contains
        //indexOf result is not -1

        if(technologies.indexOf("c++")>-1){
            System.out.println("c++ = "+c++);

    }else{
            System.out.println("c++ is not present");
        }
        
        int firstComma = technologies.indexOf(",");
        System.out.println("firstComma = " + firstComma);
        
        int lastComma = technologies.lastIndexOf(",");// finding the last  comma in the string name.
        System.out.println("lastComma = " + lastComma);

        //how to find the second or third comma?
        System.out.println(technologies.indexOf(",", 5));
        int secondComma = technologies.indexOf(",",5);
        System.out.println("secondComma = " + secondComma);
        System.out.println(technologies.indexOf(",",secondComma+1));
        int thirdComma = technologies.indexOf(",",secondComma+1);
        System.out.println("thirdComma = " + thirdComma);

        String url = "www.cybertekschool.okta.com";
        System.out.println(url.indexOf("."));
        int firstDot = url.indexOf(".");
        System.out.println("firstDot = " + firstDot);
        int SecondDot = url.indexOf(".",firstDot+1);
        System.out.println("SecondDot = " + SecondDot);
        int thirdDot = url.indexOf(".",SecondDot+1);
        System.out.println("thirdDot = " + thirdDot);

    }
}