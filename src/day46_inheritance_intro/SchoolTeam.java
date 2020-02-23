package day46_inheritance_intro;

public class SchoolTeam {
    public static void main(String[] args) {
        Person marufjon = new Person();
        marufjon.name = "Marufjon";
        marufjon.age = 22;
        marufjon.gender = 'm';
       // marufjon.course = "yes"; ERROR


        Student nadir = new Student();
        nadir.name = "Nadir";
        nadir.age = 25;
        nadir.gender = 'm';
        nadir.course = "SDLC vs STLC";

        nadir.walk();
        marufjon.walk();
        nadir.speak();
        marufjon.speak();

        Employee kiki = new Employee();
        kiki.name = "Kiki";
        kiki.age = 28;
        kiki.gender = 'f';
        kiki.jobTitle = "SDET";
        kiki.walk();
        kiki.speak();
        kiki.work();
        kiki.eat("farmers salad");
        marufjon.eat("free pasta");
        nadir.eat("shish kabob");

    }
}
