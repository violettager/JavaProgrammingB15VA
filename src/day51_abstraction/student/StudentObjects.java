package day51_abstraction.student;

public class StudentObjects {
    public static void main(String[] args) {
       // Student st = new Student() {}
        CalambaStudent calamba = new CalambaStudent();
        calamba.name = "May";
        calamba.getVisa();
        calamba.attendClass();

        CampusStudent campus = new CampusStudent();
        campus.name = "Vitaly";
        campus.playPingPong();
    }
}
